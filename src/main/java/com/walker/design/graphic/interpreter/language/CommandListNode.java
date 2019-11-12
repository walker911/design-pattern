package com.walker.design.graphic.interpreter.language;

import java.util.ArrayList;
import java.util.List;

/**
 * <command list> ::= <command>* end
 * @author walker
 * @date 2019/11/11
 */
public class CommandListNode extends Node {

    private List<Node> list = new ArrayList<>();

    @Override
    public void parse(Context context) throws ParseException {
        while (true) {
            if (context.currentToken() == null) {
                throw new ParseException("Missing 'end'");
            } else if (context.currentToken().equals("end")) {
                context.skipToken("end");
                break;
            } else {
                Node commandNode = new CommandNode();
                commandNode.parse(context);
                list.add(commandNode);
            }
        }
    }

    @Override
    public String toString() {
        return list.toString();
    }

    @Override
    public void execute() throws ExecuteException {
        for (Node node : list) {
            node.execute();
        }
    }
}
