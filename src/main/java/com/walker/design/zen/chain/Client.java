package com.walker.design.zen.chain;

/**
 * @author walker
 * @date 2019/7/16
 */
public class Client {
    public static void main(String[] args) {
        ProcessingObject<String> process1 = new HeaderTextProcessing();
        ProcessingObject<String> process2 = new SpellCheckerProcessing();

        process1.setSuccessor(process2);

        String result = process1.handler("Aren't labdas really wrong?!!");
        System.out.println(result);
    }
}
