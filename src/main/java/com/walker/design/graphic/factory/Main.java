package com.walker.design.graphic.factory;

import com.walker.design.graphic.factory.card.IDCard;
import com.walker.design.graphic.factory.card.IDCardFactory;
import com.walker.design.graphic.factory.framework.Factory;
import com.walker.design.graphic.factory.framework.Product;

/**
 * @author walker
 * @date 2019/10/28
 */
public class Main {
    public static void main(String[] args) {
        Factory factory = new IDCardFactory();
        Product card1 = factory.create("小明");
        Product card2 = factory.create("小红");
        Product card3 = factory.create("小刚");

        card1.use();
        card2.use();
        card3.use();
    }
}
