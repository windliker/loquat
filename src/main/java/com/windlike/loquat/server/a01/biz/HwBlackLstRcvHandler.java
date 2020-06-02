package com.windlike.loquat.server.a01.biz;

import com.windlike.loquat.server.a01.BlackLstRcvAbstractHandler;
import com.windlike.loquat.server.a01.BlackLstRcvHandlerType;
import org.springframework.stereotype.Component;

import java.util.HashMap;
import java.util.Map;

@Component
@BlackLstRcvHandlerType("Hw20200602") // sysName
public class HwBlackLstRcvHandler extends BlackLstRcvAbstractHandler {
    @Override
    public Map<String, Object> handle(Map<String, Object> reqMap) throws Exception {
        Map<String, Object> retMap = new HashMap<>();
        retMap.put("name", "Hw-20200602");
        retMap.put("result", "failure");
        return retMap;
    }
}
