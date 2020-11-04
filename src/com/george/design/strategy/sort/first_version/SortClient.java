package com.george.design.strategy.sort.first_version;

public class SortClient {
    public static void main(String[] args) {
        Sorter sorter1 = new Sorter();
        sorter1.sortFile(args[0]);
    }
}
