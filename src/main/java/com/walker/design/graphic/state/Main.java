package com.walker.design.graphic.state;

/**
 * @author walker
 * @date 2019/11/7
 */
public class Main {
    public static void main(String[] args) {
        SafeFrame frame = new SafeFrame("State Sample");
        while (true) {
            for (int i = 0; i < 24; i++) {
                frame.setClock(i);
                try {
                    Thread.sleep(1000);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }
        }
    }
}
