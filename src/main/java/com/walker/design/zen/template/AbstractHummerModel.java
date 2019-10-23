package com.walker.design.zen.template;

/**
 * @author walker
 * @date 2019/3/25
 */
public abstract class AbstractHummerModel {

    /**
     * start
     */
    protected abstract void start();

    /**
     * stop
     */
    protected abstract void stop();

    /**
     * alarm
     */
    protected abstract void alarm();

    /**
     * engine boom
     */
    protected abstract void engineBoom();

    public final void run() {
        this.start();
        this.engineBoom();
        this.alarm();
        this.stop();
    }
}
