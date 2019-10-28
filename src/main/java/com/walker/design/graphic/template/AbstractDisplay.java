package com.walker.design.graphic.template;

/**
 * Template Method: 模板方法模式
 * 在父类中定义处理流程的框架，在子类中实现具体处理的模式
 *
 * @author walker
 * @date 2019/10/28
 */
public abstract class AbstractDisplay {
    public abstract void open();
    public abstract void print();
    public abstract void close();

    /**
     * Template Method
     */
    public final void display() {
        open();
        for (int i = 0; i < 5; i++) {
            print();
        }
        close();
    }
}
