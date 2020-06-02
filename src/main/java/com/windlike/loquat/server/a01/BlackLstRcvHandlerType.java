package com.windlike.loquat.server.a01;

import java.lang.annotation.*;

/**
 * 黑名单接收自定义注解
 */
@Target({ElementType.TYPE})
@Retention(RetentionPolicy.RUNTIME)
@Documented
@Inherited
public @interface BlackLstRcvHandlerType {
    String value();
}
