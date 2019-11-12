package com.walker.design.graphic.interpreter.language;

/**
 * <program> ::= program <command list>
 *
 * @author walker
 * @date 2019/11/11
 */
public class ProgramNode extends Node {

    private Node commandListNode;

    @Override
    public void parse(Context context) throws ParseException {
        context.skipToken("program");
        commandListNode = new CommandListNode();
        commandListNode.parse(context);
    }

    @Override
    public String toString() {
        return "[program " + commandListNode + "]";
    }

    @Override
    public void execute() throws ExecuteException {
        commandListNode.execute();
    }
}
