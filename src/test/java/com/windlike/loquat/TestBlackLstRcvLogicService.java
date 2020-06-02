package com.windlike.loquat;

import com.windlike.loquat.server.a01.BlackLstRcvLogicService;
import org.junit.Test;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.HashMap;
import java.util.Map;

public class TestBlackLstRcvLogicService extends ApplicationTests {

    private BlackLstRcvLogicService blackLstRcvLogicService;

    @Autowired
    public void setBlackLstRcvLogicService(BlackLstRcvLogicService blackLstRcvLogicService) {
        this.blackLstRcvLogicService = blackLstRcvLogicService;
    }

    @Test
    public void test1() throws Exception {
        Map<String, Object> reqMap = new HashMap<>();
        Map<String, Object> reqSvcBody = new HashMap<>();
        reqSvcBody.put("sysName", "Hw20200602");
        reqMap.put("reqSvcBody", reqSvcBody);
        Map<String, Object> rspMap = blackLstRcvLogicService.handle(reqMap);
        System.out.println(rspMap.get("name"));
        System.out.println(rspMap.get("result"));
    }

}
