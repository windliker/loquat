package com.windlike.loquat.designpattern.singleton;

// 懒汉式
//不会提前把实例创建出来，将类对自己的实例化延迟到第一次被引用的时候。
//getInstance方法的作用是希望该对象在第一次被使用的时候被new出来。
//线程安全问题。在多线程情况下，有可能两个线程同时进入if语句中，
//这样，在两个线程都从if中退出的时候就创建了两个不一样的对象。
public class Singleton3 {

    private static Singleton3 instance;

    private Singleton3() {}

    public static Singleton3 getInstance() {
        if (instance == null) {
            instance = new Singleton3();
        }
        return instance;
    }
}
