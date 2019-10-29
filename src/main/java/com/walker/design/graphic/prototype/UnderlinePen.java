package com.walker.design.graphic.prototype;

/**
 * 具体的原型
 *
 * @author walker
 * @date 2019/10/29
 */
public class UnderlinePen extends AbstractProduct {

    private char ulchar;

    public UnderlinePen(char ulchar) {
        this.ulchar = ulchar;
    }

    @Override
    public void use(String str) {
        int length = str.getBytes().length;
        System.out.println("\"" + str + "\"");
        System.out.print(" ");
        for (int i = 0; i < length; i++) {
            System.out.print(ulchar);
        }
        System.out.println("");
    }
}
