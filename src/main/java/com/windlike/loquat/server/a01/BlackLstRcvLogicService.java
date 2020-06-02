package com.windlike.loquat.server.a01;

import java.util.Map;

public interface BlackLstRcvLogicService {

    /**
     * 黑名单接收接口业务逻辑处理方法
     * @param reqMap
     * @return
     * @throws Exception
     */
     Map<String, Object> handle(Map<String, Object> reqMap) throws Exception;
}
