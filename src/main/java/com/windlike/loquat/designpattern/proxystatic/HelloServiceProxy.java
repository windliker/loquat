package com.windlike.loquat.designpattern.staticproxy;

public class HelloServiceProxy implements HelloService{

    private HelloService target;

    public HelloServiceProxy(HelloService target) {
        this.target = target;
    }

    @Override
    public void say() {
        System.out.println("记录日志");
        target.say();
        System.out.println("清理数据");
    }
}
