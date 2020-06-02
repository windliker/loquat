package com.windlike.loquat.service;

public interface SmsChannelService {
    //发送短信
    void send(String phoneNo,String content);

    //关键：增加getChannelType()方法，子类实现这个方法用于标识出渠道类型
    String getChannelType();
}
