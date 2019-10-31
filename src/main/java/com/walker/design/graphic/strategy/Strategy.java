package com.walker.design.graphic.strategy;

/**
 * Strategy: 策略模式
 * 猜拳策略
 *
 * @author walker
 * @date 2019/10/23
 */
public interface Strategy {

    /**
     * 获取下一局要出的手势
     *
     * @return
     */
    Hand nextHand();

    /**
     * 学习上一局的手势是否获胜了
     *
     * @param win
     */
    void study(boolean win);
}
