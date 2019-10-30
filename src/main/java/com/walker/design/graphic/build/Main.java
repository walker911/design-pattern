package com.walker.design.graphic.build;

/**
 * @author walker
 * @date 2019/10/29
 */
public class Main {
    public static void main(String[] args) {
        TextBuilder textBuilder = new TextBuilder();
        Director director = new Director(textBuilder);
        director.construct();
        System.out.println(textBuilder.getResult());

        HTMLBuilder htmlBuilder = new HTMLBuilder();
        Director htmlDirector = new Director(htmlBuilder);
        htmlDirector.construct();
        System.out.println(htmlBuilder.getResult());

        FrameBuilder frameBuilder = new FrameBuilder();
        Director frameDirector = new Director(frameBuilder);
        frameDirector.construct();
        frameBuilder.getResult().setVisible(true);
    }
}
