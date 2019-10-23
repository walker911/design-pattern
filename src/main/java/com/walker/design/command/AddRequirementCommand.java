package com.walker.design.command;

/**
 * @author walker
 * @date 2019/3/27
 */
public class AddRequirementCommand extends AbstractCommand {
    @Override
    public void execute() {
        super.requirementGroup.find();
        super.requirementGroup.add();
        super.requirementGroup.plan();
    }
}
