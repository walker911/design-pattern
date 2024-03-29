package com.walker.design.graphic.strategy.sort;

/**
 * @author walker
 * @date 2019/10/31
 */
public class SelectionSorter implements Sorter {
    @Override
    public void sort(Comparable[] data) {
        for (int i = 0; i < data.length - 1; i++) {
            int min = i;
            for (int j = i + 1; j < data.length; j++) {
                if (data[min].compareTo(data[j]) > 0) {
                    min = j;
                }
            }
            Comparable temp = data[min];
            data[min] = data[i];
            data[i] = temp;
        }
    }
}
