package com.windlike.loquat.server.a01;

import java.util.Map;

public abstract class BlackLstRcvAbstractHandler {

    /**
     * 黑名单接收业务逻辑处理方法
     * @param reqMap
     * @return
     * @throws Exception
     */
    abstract public Map<String, Object> handle(Map<String, Object> reqMap) throws Exception;

    /**
     * merge产品表
     * @throws Exception
     */
    public void mergePrdTable() throws Exception{}

}
