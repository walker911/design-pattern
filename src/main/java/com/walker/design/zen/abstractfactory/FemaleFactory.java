package com.walker.design.zen.abstractfactory;

/**
 * @author walker
 * @date 2019/3/26
 */
public class FemaleFactory implements HumanFactory {
    @Override
    public Human createWhiteHuman() {
        return new FemaleWhiteHuman();
    }

    @Override
    public Human createBlackHuman() {
        return new FemaleBlackHuman();
    }

    @Override
    public Human createYellowHuman() {
        return new FemaleWhiteHuman();
    }
}
