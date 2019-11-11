package com.walker.design.graphic.flyweight;

import java.util.HashMap;
import java.util.Map;

/**
 * 生成BigChar类的实例的工厂，实现了共享实例的功能
 *
 * @author walker
 * @date 2019/11/11
 */
public class BigCharFactory {
    private Map<String, BigChar> pool = new HashMap<>();
    private static BigCharFactory factory = new BigCharFactory();

    private BigCharFactory() {
    }

    public static BigCharFactory getInstance() {
        return factory;
    }

    public synchronized BigChar getBigChar(char charname) {
        BigChar bc = pool.get("" + charname);
        if (bc == null) {
            bc = new BigChar(charname);
            pool.put("" + charname, bc);
        }

        return bc;
    }
}
