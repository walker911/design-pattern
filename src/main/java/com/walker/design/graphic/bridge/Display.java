package com.walker.design.graphic.bridge;

/**
 * Bridge模式：桥梁模式
 * 作用：在类的功能层次结构和类的实现层次结构搭建桥梁
 *
 * @author walker
 * @date 2019/10/23
 */
public class Display {

    /**
     * 使用委托代替继承，类的任务发生转移
     * 继承是强关联关系，委托是弱关联关系
     */
    private DisplayImpl impl;

    public Display(DisplayImpl impl) {
        this.impl = impl;
    }

    public void open() {
        impl.rawOpen();
    }

    public void print() {
        impl.rawPrint();
    }

    public void close() {
        impl.rawClose();
    }

    public final void display() {
        open();
        print();
        close();
    }
}
