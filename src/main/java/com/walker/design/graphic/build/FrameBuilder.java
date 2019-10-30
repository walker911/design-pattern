package com.walker.design.graphic.build;

import javax.swing.*;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;

/**
 * @author walker
 * @date 2019/10/30
 */
public class FrameBuilder implements Builder {

    private JFrame frame = new JFrame();
    private Box box = new Box(BoxLayout.Y_AXIS);

    @Override
    public void makeTitle(String title) {
        frame.setTitle(title);
    }

    @Override
    public void makeString(String str) {
        box.add(new JLabel(str));
    }

    @Override
    public void makeItems(String[] items) {
        Box innerBox = new Box(BoxLayout.Y_AXIS);
        for (int i = 0; i < items.length; i++) {
            JButton button = new JButton(items[i]);
            button.addActionListener(event -> System.out.println(event.getActionCommand()));
            innerBox.add(button);
        }
        box.add(innerBox);
    }

    @Override
    public void close() {
        frame.getContentPane().add(box);
        frame.pack();
        frame.addWindowListener(new WindowAdapter() {
            @Override
            public void windowClosing(WindowEvent e) {
                System.exit(0);
            }
        });
    }

    public JFrame getResult() {
        return frame;
    }
}
