package com.windlike.loquat;

import com.windlike.loquat.service.SmsSendService;
import org.junit.Test;
import org.springframework.beans.factory.annotation.Autowired;

public class TestSmsSend extends ApplicationTests {

    private SmsSendService smsSendService;

    @Autowired
    public void setSmsSendService(SmsSendService smsSendService) {
        this.smsSendService = smsSendService;
    }

    @Test
    public void test1() {
        smsSendService.send(null, null);
    }

    @Test
    public void test2() {
        smsSendService.send(null, null, "CHANNEL_B");
    }

}
