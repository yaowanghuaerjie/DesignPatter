package com.george.design.cursorpattern;

import java.util.ArrayList;

public class Demo {
    public static void main(String[] args) {
        ArrayList<String> names = new ArrayList<>();
        names.add("george");
        names.add("John");
        names.add("Jordan");
        Iterator<String> iterator = new ArrayIterator<>(names);
        while (iterator.hasNext()){
            System.out.println(iterator.currentItem());
            iterator.next();
        }
    }


}
