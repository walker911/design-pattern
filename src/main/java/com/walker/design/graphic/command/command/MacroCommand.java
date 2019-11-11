package com.walker.design.graphic.command.command;

import java.util.Iterator;
import java.util.Stack;

/**
 * @author walker
 * @date 2019/11/11
 */
public class MacroCommand implements Command {

    private Stack<Command> commands = new Stack<>();

    @Override
    public void execute() {
        for (Command command : commands) {
            command.execute();
        }
    }

    public void append(Command command) {
        if (command != null) {
            commands.push(command);
        }
    }

    public void undo() {
        if (!commands.empty()) {
            commands.pop();
        }
    }

    public void clear() {
        commands.clear();
    }


}
