package com.walker.design.graphic.abstraction;

import java.util.Random;

/**
 * @author walker
 * @date 2019/10/30
 */
public class Main {
    public static void main(String[] args) {
        Random random = new Random();
        for (int i = 0; i < 3; i++) {
            System.out.println(1 + random.nextInt(3));
        }
    }
}
