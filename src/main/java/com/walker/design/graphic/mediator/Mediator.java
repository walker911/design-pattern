package com.walker.design.graphic.mediator;

/**
 * @author walker
 * @date 2019/11/6
 */
public interface Mediator {
    /**
     * 生成组员
     */
    void createColleagues();

    /**
     * 被组员调用
     */
    void colleagueChanged();
}
