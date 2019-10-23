package com.walker.design.zen.strategy;

/**
 * @author walker
 * @date 2019/7/11
 */
public class ClientLambdaTestDrive {
    public static void main(String[] args) {
        Validator numberValidator = new Validator(new IsNumberic());
        boolean res1 = numberValidator.validate("7780");
        System.out.println(res1);

        Validator lowerCaseValidator = new Validator(new IsAllLowerCase());
        boolean res2 = lowerCaseValidator.validate("aaadd");
        System.out.println(res2);
    }
}
