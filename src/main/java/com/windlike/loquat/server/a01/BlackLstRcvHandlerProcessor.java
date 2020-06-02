package com.windlike.loquat.server.a01;

import com.google.common.collect.Maps;
import com.windlike.loquat.util.ClassScanner;
import org.springframework.beans.BeansException;
import org.springframework.beans.factory.config.BeanFactoryPostProcessor;
import org.springframework.beans.factory.config.ConfigurableListableBeanFactory;
import org.springframework.stereotype.Component;

import java.util.Map;

@Component
public class BlackLstRcvHandlerProcessor implements BeanFactoryPostProcessor {

    private static final String HANDLER_PACKAGE = "com.windlike.loquat.server.a01.biz";

    /**
     * 扫描@HandlerType,初始化HandlerContext,将其注册到Spring容器中
     * @param configurableListableBeanFactory
     * @throws BeansException
     */
    @Override
    public void postProcessBeanFactory(ConfigurableListableBeanFactory configurableListableBeanFactory) throws BeansException {
        final Map<String, Class<?>> handlerMap = Maps.newHashMapWithExpectedSize(10);
        ClassScanner.scan(HANDLER_PACKAGE, BlackLstRcvHandlerType.class).forEach(clazz -> {
            handlerMap.put(clazz.getAnnotation(BlackLstRcvHandlerType.class).value(), clazz);
        });

        BlackLstRcvHandlerContext context = new BlackLstRcvHandlerContext(handlerMap);
        configurableListableBeanFactory.registerSingleton(BlackLstRcvHandlerContext.class.getName(), context);
    }

}
