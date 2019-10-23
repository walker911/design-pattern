package com.walker.design.decorator;

/**
 * @author walker
 * @date 2019/3/29
 */
public class SortDecorator extends Decorator {

    public SortDecorator(AbstractSchoolReport schoolReport) {
        super(schoolReport);
    }

    private void sort() {
        System.out.println("sort");
    }

    @Override
    public void report() {
        super.report();
        this.sort();
    }
}
