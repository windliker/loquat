package com.windlike.loquat.service;

import com.windlike.loquat.factory.SmsChannelFactory;
import org.springframework.stereotype.Service;

@Service
public class SmsSendService {

    private final SmsChannelFactory smsChannelFactory;

    public SmsSendService(SmsChannelFactory smsChannelFactory) {
        this.smsChannelFactory = smsChannelFactory;
    }

    public void send(String phoneNo,String content){
        //从配置中读取短信渠道类型
//        String channelType=config.getChannelType();
        String channelType = "CHANNEL_C";
        //构建渠道类型对应的服务类
        SmsChannelService channelService=smsChannelFactory.buildService(channelType);
        //发送短信
        channelService.send(phoneNo,content);
    }
}
