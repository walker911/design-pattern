package com.walker.design.graphic.memento.game;

import java.util.ArrayList;
import java.util.List;

/**
 * @author walker
 * @date 2019/11/7
 */
public class Memento {
    int money;
    List<String> fruits;

    Memento(int money) {
        this.money = money;
        this.fruits = new ArrayList<>();
    }

    public int getMoney() {
        return money;
    }

    void addFruit(String fruit) {
        fruits.add(fruit);
    }

    List<String> getFruits() {
        return fruits;
    }
}
