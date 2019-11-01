package com.walker.design.graphic.decorator;

/**
 * Decorator模式：装饰器模式
 *
 * @author walker
 * @date 2019/11/1
 */
public class Main {
    public static void main(String[] args) {
        Display d1 = new StringDisplay("Hello, World.");
        Display d2 = new UpDownBorder(d1, '-');
        Display d3 = new SideBorder(d2, '*');
        d1.show();
        d2.show();
        d3.show();

        Display d4 = new FullBorder(new UpDownBorder(new SideBorder(new UpDownBorder(new SideBorder(new StringDisplay("你好，世界"), '*'), '='), '|'), '/'));
        d4.show();

        MultiStringDisplay md = new MultiStringDisplay();
        md.add("早上好。");
        md.add("下午好。");
        md.add("晚安，明天见。");
        md.show();

        Display b1 = new SideBorder(md, '#');
        b1.show();

        Display b2 = new FullBorder(md);
        b2.show();
    }
}
