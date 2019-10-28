package com.walker.design.graphic.factory.framework;

/**
 * @author walker
 * @date 2019/10/28
 */
public abstract class Factory {

    protected abstract Product createProduct(String owner);

    protected abstract void registerProduct(Product product);

    public final Product create(String owner) {
        Product product = createProduct(owner);
        registerProduct(product);
        return product;
    }
}
