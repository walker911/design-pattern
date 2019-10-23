package com.walker.design.zen.chain.trouble;

/**
 * 解决奇数编号
 *
 * @author walker
 * @date 2019/10/17
 */
public class OddSupport extends Support {

    public OddSupport(String name) {
        super(name);
    }

    @Override
    protected boolean resolve(Trouble trouble) {
        if (trouble.getNumber() % 2 == 1) {
            return true;
        }
        return false;
    }
}
