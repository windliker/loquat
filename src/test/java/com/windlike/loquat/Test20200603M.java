package com.windlike.loquat;

import com.windlike.loquat.singleton.Loquat;
import com.windlike.loquat.singleton.SingleLoquat;

public class Test20200603M {
    public static void main(String[] args) {
        test1();
    }

    private static void test1() {
        for (int i = 0; i < 2000; i++) {
            new Thread(() -> {
                System.out.println(Thread.currentThread());
                Loquat loquat = SingleLoquat.INSTANCE.getLoquat();
//                System.out.println(loquat);
            }).start();
//            new Thread() {
//                @Override
//                public void run() {
//                    Loquat loquat = SingleLoquat.INSTANCE.getLoquat();
//                }
//            }.start();
        }
    }

}
