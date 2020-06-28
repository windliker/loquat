package com.windlike.loquat.util.time;

import java.time.LocalDate;
import java.time.Period;

public class TimeInJava8 {
    public static void main(String[] args) {
        test1();
        test2();
        test3();
        test4();

    }

    private static void test4() {
        Period period = Period.between(LocalDate.of(2018, 1, 5),LocalDate.of(2018, 2, 5));
    }

    private static void test3() {
        LocalDate nowDate = LocalDate.now();
//判断闰年
        boolean leapYear = nowDate.isLeapYear();
    }

    private static void test2() {
        LocalDate date = LocalDate.of(2018, 01, 01);
    }

    private static void test1() {
        LocalDate today = LocalDate.now();
        int year = today.getYear();
        int month = today.getMonthValue();
        int day = today.getDayOfMonth();
        System.out.printf("Year : %d Month : %d day : %d t %n", year,month, day);
    }
}
