package com.walker.design.facade;

/**
 * @author walker
 * @date 2019/3/26
 */
public class Client {
    public static void main(String[] args) {
        ModernPostOffice postOffice = new ModernPostOffice();
        postOffice.sendLetter("letter", "china");
    }
}
