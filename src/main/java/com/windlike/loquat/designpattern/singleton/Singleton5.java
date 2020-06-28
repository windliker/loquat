package com.windlike.loquat.designpattern.singleton;

// 使用final
class Wrapper<T> {
    public final T value;

    public Wrapper(T value) {
        this.value = value;
    }
}

public class Singleton5 {
    private Wrapper<Singleton5> helperWrapper;

    public Singleton5 getInstance() {
        Wrapper<Singleton5> wrapper = helperWrapper;

        if (wrapper == null) {
            synchronized (this) {
                if (helperWrapper == null) {
                    helperWrapper = new Wrapper<>(new Singleton5());
                }
                wrapper = helperWrapper;
            }
        }
        return wrapper.value;
    }

}
