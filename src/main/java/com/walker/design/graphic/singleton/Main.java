package com.walker.design.graphic.singleton;

/**
 * @author walker
 * @date 2019/10/29
 */
public class Main {
    public static void main(String[] args) {
        System.out.println("Start.");
        Singleton s1 = Singleton.getInstance();
        Singleton s2 = Singleton.getInstance();
        if (s1 == s2) {
            System.out.println("s1和s2是相同实例");
        } else {
            System.out.println("s1和s2不是相同实例");
        }
        System.out.println("End.");
    }
}
