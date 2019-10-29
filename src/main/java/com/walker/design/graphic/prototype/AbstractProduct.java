package com.walker.design.graphic.prototype;

import com.walker.design.graphic.prototype.framework.Product;

/**
 * @author walker
 * @date 2019/10/29
 */
public abstract class AbstractProduct implements Product {
    @Override
    public Product createClone() {
        Product p = null;
        try {
            p = (Product) clone();
        } catch (CloneNotSupportedException e) {
            e.printStackTrace();
        }
        return p;
    }
}
