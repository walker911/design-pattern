package com.walker.design.template;

/**
 * @author walker
 * @date 2019/3/25
 */
public class Client {
    public static void main(String[] args) {
        AbstractHummerModel hummerModel = new HummerH1Model();
        hummerModel.run();
    }
}
