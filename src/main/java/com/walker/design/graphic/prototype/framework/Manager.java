package com.walker.design.graphic.prototype.framework;

import java.util.HashMap;
import java.util.Map;

/**
 * @author walker
 * @date 2019/10/29
 */
public class Manager {
    private Map<String, Product> showcase = new HashMap<>();

    public void register(String name, Product proto) {
        showcase.put(name, proto);
    }

    public Product create(String protoname) {
        Product p = showcase.get(protoname);
        return p.createClone();
    }
}
