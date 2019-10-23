package com.walker.design.command;

/**
 * @author walker
 * @date 2019/3/27
 */
public class Invoker {

    private AbstractCommand command;

    public void setCommand(AbstractCommand command) {
        this.command = command;
    }

    public void action() {
        this.command.execute();
    }
}
