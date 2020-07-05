package com.windlike.loquat.designpattern.staticproxy;

public class HelloServiceImpl implements HelloService {

    @Override
    public void say() {
        System.out.println("hello world");
    }
}