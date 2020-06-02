package com.windlike.loquat.server.a01.biz;

import com.windlike.loquat.server.a01.BlackLstRcvAbstractHandler;
import com.windlike.loquat.server.a01.BlackLstRcvHandlerType;
import org.springframework.stereotype.Component;

import java.util.HashMap;
import java.util.Map;

@Component
@BlackLstRcvHandlerType("Ali20200602") // sysName
public class AliBlackLstRcvHandler extends BlackLstRcvAbstractHandler {
    @Override
    public Map<String, Object> handle(Map<String, Object> reqMap) throws Exception {
        Map<String, Object> retMap = new HashMap<>();
        retMap.put("name", "Ali-20200602");
        retMap.put("result", "success");
        return retMap;
    }
}
