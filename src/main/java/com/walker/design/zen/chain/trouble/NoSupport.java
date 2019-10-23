package com.walker.design.zen.chain.trouble;

/**
 * @author walker
 * @date 2019/10/17
 */
public class NoSupport extends Support {

    public NoSupport(String name) {
        super(name);
    }

    @Override
    protected boolean resolve(Trouble trouble) {
        return false;
    }
}
