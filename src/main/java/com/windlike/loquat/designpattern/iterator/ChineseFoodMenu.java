package com.windlike.loquat.designpattern.iterator;

public class ChineseFoodMenu implements Menu{

    private String[] foods = new String[4];
    private int position = 0;

    @Override
    public void add(String name) {
        foods[position++] = name;
    }

    @Override
    public Iterator<String> getIterator() {
        return new MenuIterator<>(this.foods);
    }
}
