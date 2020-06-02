package com.windlike.loquat.factory;

import com.windlike.loquat.service.SmsChannelService;
import org.springframework.stereotype.Component;
import org.springframework.util.CollectionUtils;

import javax.annotation.PostConstruct;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

@Component
public class SmsChannelFactory {
    private Map<String, SmsChannelService> serviceMap;

    /*注入：通过spring容器将所有实现 SmsChannelService 接口的类的实例注入到 serviceList 中*/
    // 构造注入代替字段注入
    private final List<SmsChannelService> serviceList;

    public SmsChannelFactory(List<SmsChannelService> serviceList) {
        this.serviceList = serviceList;
    }

    /*通过 @PostConstruct 注解，在 SmsChannelFactory 实例化后，来初始化 serviceMap */
    @PostConstruct
    private void init(){
        if(CollectionUtils.isEmpty(serviceList)){
            return;
        }
        serviceMap = new HashMap<>(serviceList.size());
        //将 serviceList 转换为 serviceMap
        for (SmsChannelService channelService : serviceList) {
            String channelType=channelService.getChannelType();
            //重复性校验，避免不同实现类的 getChannelType() 方法返回同一个值。
            if(serviceMap.get(channelType) != null){
                throw new RuntimeException("同一个短信渠道只能有一个实现类");
            }
			/*渠道类型为 key , 对应的服务类为value ：
			与“优化代码1”中的通过手工设置“CHANNEL_A"、"CHANNEL_B"相比，
			这种方式更加自动化，后续在增加“CHANNEL_C"无需再改此处代码*/
            serviceMap.put(channelType,channelService);
        }
        System.out.println(serviceMap);
    }

    //根据渠道类型获取对应短信渠道的Service
    public SmsChannelService buildService(String channelType){
        return serviceMap.get(channelType);
    }
}
