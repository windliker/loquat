package com.windlike.loquat.designpattern.proxystatic;

public class HelloServiceImpl implements HelloService {

    @Override
    public void say() {
        System.out.println("hello world");
    }
}