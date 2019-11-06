package com.walker.design.graphic.mediator;

import java.awt.*;

/**
 * @author walker
 * @date 2019/11/6
 */
public class ColleagueButton extends Button implements Colleague {

    private Mediator mediator;

    public ColleagueButton(String caption) {
        super(caption);
    }

    @Override
    public void setMediator(Mediator mediator) {
        this.mediator = mediator;
    }

    @Override
    public void setColleagueEnabled(boolean enabled) {
        // mediator 下达启用/禁用指示
        super.setEnabled(enabled);
    }
}
