package com.windlike.loquat.server.a01;

import com.windlike.loquat.util.BeanTool;

import java.util.Map;

/**
 * 黑名单接收处理器上下文，根据sysName获取相应的处理器
 */
public class BlackLstRcvHandlerContext {

    private Map<String, Class<?>> handlerMap;

    public BlackLstRcvHandlerContext(Map<String, Class<?>> handlerMap) {
        this.handlerMap = handlerMap;
    }

    public BlackLstRcvAbstractHandler getInstance(String sysName) throws Exception {
        Class<?> clazz = this.handlerMap.get(sysName);
        if (clazz == null) {
            throw new Exception("抛出自定义异常，异常码,sysName匹配失败");
        }
        return (BlackLstRcvAbstractHandler) BeanTool.getBean(clazz);
    }

}
