package com.windlike.loquat.designpattern.proxydynamic;

import com.windlike.loquat.designpattern.proxystatic.HelloService;
import com.windlike.loquat.designpattern.proxystatic.HelloServiceImpl;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;
import java.lang.reflect.Proxy;

public class MyInvocationHandler implements InvocationHandler {

    private Object target;

    public MyInvocationHandler(Object target) {
        this.target = target;
    }

    @Override
    public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
//        PerformanceMonior.begin(target.getClass().getName()+"."+method.getName());
        //System.out.println("-----------------begin "+method.getName()+"-----------------");
        Object result = method.invoke(target, args);
        //System.out.println("-----------------end "+method.getName()+"-----------------");
//        PerformanceMonior.end();
        return result;
    }

    public Object getProxy(){
        return Proxy.newProxyInstance(
                Thread.currentThread().getContextClassLoader(), target.getClass().getInterfaces(), this);
    }

    public static void main(String[] args) {
        HelloService service = new HelloServiceImpl();
        MyInvocationHandler handler = new MyInvocationHandler(service);
        HelloService proxy = (HelloService) handler.getProxy();
        proxy.say();
    }

}