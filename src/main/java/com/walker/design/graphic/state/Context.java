package com.walker.design.graphic.state;

/**
 * @author walker
 * @date 2019/11/7
 */
public interface Context {
    void setClock(int hour);

    void changeState(State state);

    void callSecurityCenter(String msg);

    void recordLog(String msg);
}
