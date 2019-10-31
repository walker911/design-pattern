package com.walker.design.graphic.strategy;

import java.util.Random;

/**
 * 具体策略：
 * 若上局手势胜，则下局和上局相同
 * 若上局手势败，则下局随机出手势
 *
 * @author walker
 * @date 2019/10/23
 */
public class WinningStrategy implements Strategy {

    private Random random;
    /**
     * 上局胜负
     */
    private boolean won;
    /**
     * 保存上局手势
     */
    private Hand prevHand;

    public WinningStrategy(int seed) {
        this.random = new Random(seed);
    }

    @Override
    public Hand nextHand() {
        if (!won) {
            prevHand = Hand.getHand(random.nextInt(3));
        }
        return prevHand;
    }

    @Override
    public void study(boolean win) {
        won = win;
    }
}
