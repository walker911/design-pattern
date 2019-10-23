package com.walker.design.facade;

/**
 * @author walker
 * @date 2019/3/26
 */
public class LetterProcessImpl implements ILetterProcess {
    @Override
    public void writeContext(String context) {
        System.out.println("write context " + context);
    }

    @Override
    public void fillEnvelope(String address) {
        System.out.println("fill envelope " + address);
    }

    @Override
    public void letterIntoEnvelope() {
        System.out.println("letter into envelope");
    }

    @Override
    public void sendLetter() {
        System.out.println("send letter");
    }
}
