package com.walker.design.zen.chain;

/**
 * @author walker
 * @date 2019/7/16
 */
public class HeaderTextProcessing extends ProcessingObject<String> {
    @Override
    public String handleWork(String input) {
        return "From Raoul, Mario and Alan: " + input;
    }
}
