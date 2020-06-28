package com.windlike.loquat.designpattern.iterator;

public class Main {
    public static void main(String[] args) {
        Menu menu = new ChineseFoodMenu();
        menu.add("黄焖鸡米饭");
        menu.add("辣子鸡丁");
        menu.add("宫保鸡丁");
        menu.add("啤酒鸭");

        Iterator<?> iterator = menu.getIterator();
        while (iterator.hasNext()) {
            System.out.println(iterator.next());
        }
    }
}
