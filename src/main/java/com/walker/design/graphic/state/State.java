package com.walker.design.graphic.state;

/**
 * @author walker
 * @date 2019/11/7
 */
public interface State {
    void doClock(Context context, int hour);

    void doUse(Context context);

    void doAlarm(Context context);

    void doPhone(Context context);
}
