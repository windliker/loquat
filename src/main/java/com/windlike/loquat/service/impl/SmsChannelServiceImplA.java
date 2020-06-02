package com.windlike.loquat.service.impl;

import com.windlike.loquat.service.SmsChannelService;
import org.springframework.stereotype.Service;

@Service
public class SmsChannelServiceImplA implements SmsChannelService {
    public void send(String phoneNo, String content) {
        System.out.println("通过短信渠道A发送短信");
    }

    //关键：增加 getChannelType() 实现
    public String getChannelType() {
        return "CHANNEL_A";
    }
}
