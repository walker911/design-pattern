package com.walker.design.graphic.interpreter.language;

/**
 * <repeat command> ::= repeat <number> <command list>
 *
 * @author walker
 * @date 2019/11/11
 */
public class RepeatCommandNode extends Node {

    private int number;
    private Node commandListNode;

    @Override
    public void parse(Context context) throws ParseException {
        context.skipToken("repeat");
        number = context.currentNumber();
        context.nextToken();
        commandListNode = new CommandListNode();
        commandListNode.parse(context);
    }

    @Override
    public String toString() {
        return "[repeat " + number + " " + commandListNode + "]";
    }

    @Override
    public void execute() throws ExecuteException {
        for (int i = 0; i < number; i++) {
            commandListNode.execute();
        }
    }
}
