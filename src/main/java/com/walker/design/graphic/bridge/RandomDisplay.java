package com.walker.design.graphic.bridge;

import java.util.Random;

/**
 * 功能：显示字符串随机次
 *
 * @author walker
 * @date 2019/10/24
 */
public class RandomDisplay extends CountDisplay {

    private Random random = new Random();

    public RandomDisplay(DisplayImpl impl) {
        super(impl);
    }

    public void randomDisplay(int times) {
        multiDisplay(random.nextInt(times));
    }
}
