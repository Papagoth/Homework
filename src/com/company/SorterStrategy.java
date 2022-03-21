package com.company;

public class SorterStrategy implements Sort {
    Sort sort;

    public SorterStrategy(Sort sort) {
        this.sort = sort;
    }

    @Override
    public void executeSort(int[] arr) {
        sort.executeSort(arr);
    }
}
