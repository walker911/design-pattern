package com.walker.design.zen.abstractfactory;

/**
 * @author walker
 * @date 2019/3/26
 */
public class Client {
    public static void main(String[] args) {
        HumanFactory maleFactory = new MaleFactory();
        HumanFactory femaleFactory = new FemaleFactory();
        Human femaleHuman = femaleFactory.createYellowHuman();
        Human maleHuman = maleFactory.createYellowHuman();
        System.out.println("--- yellow female ---");
        femaleHuman.getColor();
        femaleHuman.talk();
        femaleHuman.getSex();
        System.out.println("\n--- yellow male ---");
        maleHuman.getColor();
        maleHuman.talk();
        maleHuman.getSex();
    }
}
