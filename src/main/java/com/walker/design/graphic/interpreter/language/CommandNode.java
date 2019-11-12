package com.walker.design.graphic.interpreter.language;

/**
 * <command> ::= <repeat command> | <primitive command>
 * @author walker
 * @date 2019/11/11
 */
public class CommandNode extends Node {

    private Node node;

    @Override
    public void parse(Context context) throws ParseException {
        if (context.currentToken().equals("repeat")) {
            node = new RepeatCommandNode();
            node.parse(context);
        } else {
            node = new PrimitiveCommandNode();
            node.parse(context);
        }
    }

    @Override
    public String toString() {
        return node.toString();
    }

    @Override
    public void execute() throws ExecuteException {
        node.execute();
    }
}
