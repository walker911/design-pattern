package com.walker.design.graphic.singleton;

/**
 * @author walker
 * @date 2019/10/29
 */
public class Singleton {
    private static Singleton singleton = new Singleton();

    private Singleton() {
        System.out.println("生成了一个实例");
    }

    public static Singleton getInstance() {
        return singleton;
    }

}
