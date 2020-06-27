package com.windlike.loquat.service.impl;

import com.windlike.loquat.service.SmsChannelService;
import org.springframework.stereotype.Service;

@Service("CHANNEL_C") // channelType
public class SmsChannelServiceImplC implements SmsChannelService {
    @Override
    public void send(String phoneNo, String content) {
        System.out.println("通过短信渠道C发送短信");
    }

    @Override
    public String getChannelType() {
        return "CHANNEL_C";
    }
}
