package com.walker.design.factory;

/**
 * @author walker
 * @date 2019/3/25
 */
public class Client {
    public static void main(String[] args) {
        AbstractHumanFactory humanFactory = new HumanFactory();
        Human human = humanFactory.createHuman(YellowHuman.class);
        human.getColor();
        human.talk();
    }
}
