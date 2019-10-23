package com.walker.design.graphic.bridge;

/**
 * Bridge模式：桥梁模式
 * 作用：在类的功能层次结构和类的实现层次结构搭建桥梁
 *
 * @author walker
 * @date 2019/10/23
 */
public class Display {

    private DisplayImpl impl;

    public Display(DisplayImpl impl) {
        this.impl = impl;
    }

    public void open() {

    }

    public void print() {

    }

    public void close() {

    }

    public final void display() {
        open();
        print();
        close();
    }
}
