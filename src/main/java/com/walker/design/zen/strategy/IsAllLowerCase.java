package com.walker.design.zen.strategy;

/**
 * @author walker
 * @date 2019/7/11
 */
public class IsAllLowerCase implements ValidationStrategy {
    @Override
    public boolean execute(String s) {
        return s.matches("[a-z]+");
    }
}
