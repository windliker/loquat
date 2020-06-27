package com.windlike.loquat.service.impl;

import com.windlike.loquat.service.SmsChannelService;
import org.springframework.stereotype.Service;

@Service("CHANNEL_B") // channelType
public class SmsChannelServiceImplB implements SmsChannelService {
    @Override
    public void send(String phoneNo, String content) {
        System.out.println("通过短信渠道B发送短信");
    }

    //关键：增加 getChannelType() 实现
    @Override
    public String getChannelType() {
        return "CHANNEL_B";
    }
}
