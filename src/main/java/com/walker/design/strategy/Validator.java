package com.walker.design.strategy;

/**
 * @author walker
 * @date 2019/7/11
 */
public class Validator {

    private ValidationStrategy validationStrategy;

    public Validator(ValidationStrategy validationStrategy) {
        this.validationStrategy = validationStrategy;
    }

    public boolean validate(String s) {
        return validationStrategy.execute(s);
    }
}
