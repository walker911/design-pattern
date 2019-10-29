package com.walker.design.graphic.prototype.framework;

/**
 * Prototype模式：原型模式
 * 复制功能的接口
 *
 * 原型
 *
 * clone方法进行的是浅复制
 * 只是将被复制实例的字段值直接复制到新的实例中
 *
 * @author walker
 * @date 2019/10/29
 */
public interface Product extends Cloneable {
    void use(String str);
    Product createClone();
}
