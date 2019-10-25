package com.walker.design.graphic.adapter;

/**
 * @author walker
 * @date 2019/10/25
 */
public class Main {
    public static void main(String[] args) {
        Print print = new PrintBanner("Hello");
        print.printWeak();
        print.printStrong();
    }
}
