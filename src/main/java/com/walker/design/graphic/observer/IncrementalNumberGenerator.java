package com.walker.design.graphic.observer;

/**
 * @author walker
 * @date 2019/11/6
 */
public class IncrementalNumberGenerator extends NumberGenerator {

    private int start;
    private int end;
    private int step;
    private int number;

    public IncrementalNumberGenerator(int start, int end, int step) {
        this.start = start;
        this.end = end;
        this.step = step;
    }

    @Override
    public int getNumber() {
        return number;
    }

    @Override
    public void execute() {
        for (int i = start; i < end; i+=step) {
            number = i;
            super.notifyObservers();
        }
    }
}
