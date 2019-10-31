package com.walker.design.graphic.strategy.sort;

/**
 * @author walker
 * @date 2019/10/31
 */
public class Main {
    public static void main(String[] args) {
        String[] data = {"Dumpty", "Bowman", "Carroll", "Elfland", "Alice"};
        SortAndPrint sap = new SortAndPrint(data, new QuickSorter());
        sap.execute();
    }
}
