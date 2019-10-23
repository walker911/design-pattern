package com.walker.design.zen.command;

/**
 * @author walker
 * @date 2019/3/27
 */
public class DeletePageCommand extends AbstractCommand {
    @Override
    public void execute() {
        super.pageGroup.find();
        super.requirementGroup.delete();
        super.requirementGroup.plan();
    }
}
