package com.walker.design.graphic.flyweight;

/**
 * 组成大型字符串的类
 *
 * @author walker
 * @date 2019/11/11
 */
public class BigString {
    private BigChar[] bigChars;

    public BigString(String string, boolean shared) {
        bigChars = new BigChar[string.length()];
        BigCharFactory factory = BigCharFactory.getInstance();
        for (int i = 0; i < bigChars.length; i++) {
            if (shared) {
                bigChars[i] = factory.getBigChar(string.charAt(i));
                printMemory();
            } else {
                bigChars[i] = new BigChar(string.charAt(i));
                printMemory();
            }
        }
    }

    private void printMemory() {
        Runtime.getRuntime().gc();
        long used = Runtime.getRuntime().totalMemory() - Runtime.getRuntime().freeMemory();
        System.out.println("使用内存 = " + used);
    }

    public void print() {
        for (int i = 0; i < bigChars.length; i++) {
            bigChars[i].print();
        }
    }
}
