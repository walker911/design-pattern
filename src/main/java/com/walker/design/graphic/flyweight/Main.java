package com.walker.design.graphic.flyweight;

/**
 * Flyweight模式：通过尽量共享实例来避免new出实例
 *
 * @author walker
 * @date 2019/11/11
 */
public class Main {
    public static void main(String[] args) {
        BigString bs = new BigString("123", true);
        bs.print();
    }
}
