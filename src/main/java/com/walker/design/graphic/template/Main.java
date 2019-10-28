package com.walker.design.graphic.template;

/**
 * 无论在父类类型的变量中保存哪个子类的实例，程序都可以正常工作，
 * 这种原则称为里氏替换原则。
 *
 * @author walker
 * @date 2019/10/28
 */
public class Main {
    public static void main(String[] args) {
        AbstractDisplay d1 = new CharDisplay('H');
        AbstractDisplay d2 = new StringDisplay("Hello, World.");
        AbstractDisplay d3 = new StringDisplay("你好，世界。");
        d1.display();
        d2.display();
        d3.display();
    }
}
