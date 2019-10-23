package com.walker.design.zen.template;

/**
 * @author walker
 * @date 2019/3/25
 */
public class HummerH1Model extends AbstractHummerModel {
    @Override
    protected void start() {
        System.out.println("H1 start...");
    }

    @Override
    protected void stop() {
        System.out.println("H1 stop...");
    }

    @Override
    protected void alarm() {
        System.out.println("H1 alarm...");
    }

    @Override
    protected void engineBoom() {
        System.out.println("H1 engine boom...");
    }
}
