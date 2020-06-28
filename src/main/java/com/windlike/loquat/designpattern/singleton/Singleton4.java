package com.windlike.loquat.designpattern.singleton;

import java.io.Serializable;

public class Singleton4 implements Serializable {

    // volatile 保证线程共享变量可见性、指令执行有序性
    private static volatile Singleton4 instance;

    private Singleton4() {}

    // 99%情况下不需要同步
    public static Singleton4 getInstance() {
        // 双重校验锁
        if (instance == null) {
            synchronized (Singleton4.class) {
                if (instance == null) {
                    instance = new Singleton4();
                }
            }
        }
        return instance;
    }

    // 解决反序列化（通过反射）破坏单例的问题
    private Object readResolve() {
        return instance;
    }

}
