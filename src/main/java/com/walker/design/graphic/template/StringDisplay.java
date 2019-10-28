package com.walker.design.graphic.template;

/**
 * @author walker
 * @date 2019/10/28
 */
public class StringDisplay extends AbstractDisplay {

    private String str;
    private int length;

    public StringDisplay(String str) {
        this.str = str;
        this.length = str.getBytes().length;
    }

    @Override
    public void open() {
        printLine(length);
    }

    @Override
    public void print() {
        System.out.println("|" + str + "|");
    }

    @Override
    public void close() {
        printLine(length);
    }

    private void printLine(int len) {
        System.out.print("+");
        for (int i = 0; i < len; i++) {
            System.out.print("-");
        }
        System.out.println("+");
    }
}
