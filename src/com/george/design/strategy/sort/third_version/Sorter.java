package com.george.design.strategy.sort.third_version;

import java.io.File;

public class Sorter {
    private static final long GB = 1000 * 1000 * 1000;


    public void sortFile(String filePath) {
        File file = new File(filePath);
        long fileSize = file.length();
        ISortAlg sortAlg;
        if (fileSize < 6 * GB) {
            sortAlg = SortAlgFactory.getSortAlg("QuickSort");
        } else if (fileSize < 10 * GB) {
            sortAlg = SortAlgFactory.getSortAlg("ExternalSort");
        } else if (fileSize < 100 * GB) {
            sortAlg = SortAlgFactory.getSortAlg("ConcurrentExternalSort");
        } else {
            sortAlg = SortAlgFactory.getSortAlg("MapReduceSort");
        }
        sortAlg.sort(filePath);
    }
}
