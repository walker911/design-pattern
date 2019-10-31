package com.walker.design.graphic.strategy;

import java.util.Random;

/**
 * @author walker
 * @date 2019/10/31
 */
public class RandomStrategy implements Strategy {

    private Random random;

    public RandomStrategy(int seed) {
        this.random = new Random(seed);
    }

    @Override
    public Hand nextHand() {
        int val = random.nextInt(3);

        return Hand.getHand(val);
    }

    @Override
    public void study(boolean win) {

    }
}
