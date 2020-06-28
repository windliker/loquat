package com.windlike.loquat.designpattern.singleton;

//这是一个简单的饿汉式单例的实现
//他想要用到这个实例的时候就能够立即拿到，而不需要任何等待时间。
//所以，通过static的静态初始化方式，在该类第一次被加载的时候，就有一个实例被创建出来了。
//这样就保证在第一次想要使用该对象时，他已经被初始化好了。
//同时，由于该实例在类被加载的时候就创建出来了，所以也避免了线程安全问题

// 饿汉式单例，在类被加载的时候对象就会实例化。
// 这也许会造成不必要的消耗，因为有可能这个实例根本就不会被用到。
// 而且，如果这个类被多次加载的话也会造成多次实例化
public class Singleton1 {
    private static Singleton1 instance = new Singleton1();

    // 也可在静态代码块中实例化对象并赋值，都是在类被加载的时候实例化对象。
//    static {
//        instance = new Singleton1();
//    }

    private Singleton1() {}

    public static Singleton1 getInstance() {
        return instance;
    }

}
