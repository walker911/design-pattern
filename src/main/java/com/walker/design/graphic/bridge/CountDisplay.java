package com.walker.design.graphic.bridge;

/**
 * 类的功能层次结构
 *
 * @author walker
 * @date 2019/10/23
 */
public class CountDisplay extends Display {

    public CountDisplay(DisplayImpl impl) {
        super(impl);
    }

    public void multiDisplay(int times) {
        open();
        // 循环显示 times 次
        for (int i = 0; i < times; i++) {
            print();
        }
        close();
    }
}
