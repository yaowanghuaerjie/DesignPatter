package com.george.design.cursorpattern;

public interface Iterator<E> {
    boolean hasNext();

    //将游标后移一位
    void next();

    E currentItem();
}
