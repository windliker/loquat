package com.windlike.loquat.factory;

import com.windlike.loquat.service.SmsChannelService;
import org.springframework.stereotype.Component;
import org.springframework.util.CollectionUtils;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

@Component
public class SmsChannelFactory {

    /*注入：通过spring容器将所有实现 SmsChannelService 接口的类的实例注入到 serviceMap 中*/
    // 构造注入代替字段注入
    private final Map<String, SmsChannelService> serviceMap;

    public SmsChannelFactory(Map<String, SmsChannelService> serviceMap) {
        this.serviceMap = serviceMap;
    }

    /*通过 @PostConstruct 注解，在 SmsChannelFactory 实例化后，来初始化 serviceMap */
//    @PostConstruct
//    private void init(){}
//    @PreDestroy
//    private void destory() {}

    //根据渠道类型获取对应短信渠道的Service
    public SmsChannelService buildService(String channelType){
        return serviceMap.get(channelType);
    }

}
