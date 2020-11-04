package com.george.design.strategy.sort.second_version;

public class SortClient {
    public static void main(String[] args) {
        Sorter sorter = new Sorter();
        sorter.sortFile(args[0]);
    }

}
