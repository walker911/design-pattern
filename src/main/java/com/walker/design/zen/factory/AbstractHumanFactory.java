package com.walker.design.zen.factory;

/**
 * @author walker
 * @date 2019/3/25
 */
public abstract class AbstractHumanFactory {
    /**
     * factory method
     *
     * @param clazz
     * @param <T>
     * @return
     */
    public abstract <T extends Human> T createHuman(Class<T> clazz);
}
