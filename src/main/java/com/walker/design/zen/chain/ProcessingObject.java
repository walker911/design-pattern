package com.walker.design.zen.chain;

/**
 * @author walker
 * @date 2019/7/16
 */
public abstract class ProcessingObject<T> {

    protected ProcessingObject<T> successor;

    public void setSuccessor(ProcessingObject<T> successor) {
        this.successor = successor;
    }

    public T handler(T input) {
        T t = handleWork(input);
        if (successor != null) {
            return successor.handler(t);
        }
        return t;
    }

    public abstract T handleWork(T input);
}
