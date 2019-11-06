package com.walker.design.graphic.mediator;

/**
 * @author walker
 * @date 2019/11/6
 */
public interface Colleague {

    /**
     * 传递mediator实例
     *
     * @param mediator
     */
    void setMediator(Mediator mediator);

    /**
     * 告诉组员仲裁者所下达的指示
     *
     * @param enabled
     */
    void setColleagueEnabled(boolean enabled);
}
