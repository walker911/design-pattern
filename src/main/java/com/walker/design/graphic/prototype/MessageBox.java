package com.walker.design.graphic.prototype;

/**
 * 具体的原型
 *
 * @author walker
 * @date 2019/10/29
 */
public class MessageBox extends AbstractProduct {

    private char decochar;
    public MessageBox(char decochar) {
        this.decochar = decochar;
    }

    @Override
    public void use(String str) {
        int length = str.getBytes().length;
        for (int i = 0; i < length + 4; i++) {
            System.out.print(decochar);
        }

        System.out.println("");
        System.out.println(decochar + " " + str + " " + decochar);
        for (int i = 0; i < length + 4; i++) {
            System.out.print(decochar);
        }
        System.out.println("");
    }

    // @Override
    // public Product createClone() {
    //     Product p = null;
    //     try {
    //         p = (Product) clone();
    //     } catch (CloneNotSupportedException e) {
    //         e.printStackTrace();
    //     }
    //     return p;
    // }
}
