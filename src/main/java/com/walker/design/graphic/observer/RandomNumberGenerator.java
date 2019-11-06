package com.walker.design.graphic.observer;

import java.util.Random;

/**
 * @author walker
 * @date 2019/11/6
 */
public class RandomNumberGenerator extends NumberGenerator {

    private Random random = new Random();
    private int number;

    @Override
    public int getNumber() {
        return number;
    }

    @Override
    public void execute() {
        for (int i = 0; i < 20; i++) {
            number = random.nextInt(50);
            super.notifyObservers();
        }
    }
}
