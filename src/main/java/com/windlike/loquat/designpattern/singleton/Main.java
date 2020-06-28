package com.windlike.loquat.designpattern.singleton;

import com.windlike.loquat.singleton.Loquat;
import com.windlike.loquat.singleton.SingleLoquat;

public class Main {
    public static void main(String[] args) {
        Loquat l1 = SingleLoquat.INSTANCE.getLoquat();
        Loquat l2 = SingleLoquat.INSTANCE.getLoquat();
        System.out.println(l1 == l2);
    }
}
