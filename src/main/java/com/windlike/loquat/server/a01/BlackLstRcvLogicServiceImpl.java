package com.windlike.loquat.server.a01;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Map;

@Service
public class BlackLstRcvLogicServiceImpl implements BlackLstRcvLogicService {

    private final BlackLstRcvHandlerContext blackLstRcvHandlerContext;

    @Autowired
    public BlackLstRcvLogicServiceImpl(BlackLstRcvHandlerContext blackLstRcvHandlerContext) {
        this.blackLstRcvHandlerContext = blackLstRcvHandlerContext;
    }

    /**
     * 黑名单接收接口业务逻辑处理方法
     * @param reqMap
     * @return
     * @throws Exception
     */
    @Override
    public Map<String, Object> handle(Map<String, Object> reqMap) throws Exception {
        Map<String, Object> retMap;
        try {
            Map<String, Object> reqSvcBody = (Map<String, Object>) reqMap.get("reqSvcBody");
            BlackLstRcvAbstractHandler handler = blackLstRcvHandlerContext.getInstance(
                    String.valueOf(reqSvcBody.get("sysName")));
            retMap = handler.handle(reqMap);
        } catch (Exception e) {
            throw new Exception("异常码异常描述", e.getCause());
        }

        return retMap;
    }
}
