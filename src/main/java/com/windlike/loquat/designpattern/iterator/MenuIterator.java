package com.windlike.loquat.designpattern.iterator;

public class MenuIterator<E> implements Iterator<E> {

    E[] foods;
    int position;

    public MenuIterator(E[] foods) {
        this.foods = foods;
    }

    @Override
    public boolean hasNext() {
        return position != foods.length;
    }

    @Override
    public E next() {
        return foods[position++];
    }
}
