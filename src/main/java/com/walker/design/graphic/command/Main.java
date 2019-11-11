package com.walker.design.graphic.command;

import com.walker.design.graphic.command.command.ColorCommand;
import com.walker.design.graphic.command.command.Command;
import com.walker.design.graphic.command.command.DrawCommand;
import com.walker.design.graphic.command.command.MacroCommand;
import com.walker.design.graphic.command.drawer.DrawCanvas;

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

/**
 * @author walker
 * @date 2019/11/11
 */
public class Main extends JFrame implements ActionListener {

    private MacroCommand history = new MacroCommand();
    private DrawCanvas canvas = new DrawCanvas(400, 400, history);
    private JButton clearButton = new JButton("clear");
    private JButton redButton = new JButton("red");
    private JButton greenButton = new JButton("green");
    private JButton blueButton = new JButton("blue");
    private JButton undoButton = new JButton("undo");


    public Main(String title) {
        super(title);

        this.addWindowListener(new WindowAdapter() {
            @Override
            public void windowClosing(WindowEvent e) {
                System.exit(0);
            }
        });
        canvas.addMouseMotionListener(new MouseMotionAdapter() {
            @Override
            public void mouseDragged(MouseEvent e) {
                Command cmd = new DrawCommand(canvas, e.getPoint());
                history.append(cmd);
                cmd.execute();
            }
        });
        clearButton.addActionListener(this);
        redButton.addActionListener(this);
        greenButton.addActionListener(this);
        blueButton.addActionListener(this);
        undoButton.addActionListener(this);

        Box buttonBox = new Box(BoxLayout.X_AXIS);
        buttonBox.add(clearButton);
        buttonBox.add(redButton);
        buttonBox.add(greenButton);
        buttonBox.add(blueButton);
        buttonBox.add(undoButton);
        Box mainBox = new Box(BoxLayout.Y_AXIS);
        mainBox.add(buttonBox);
        mainBox.add(canvas);
        super.getContentPane().add(mainBox);

        super.pack();
        super.setVisible(true);
    }

    public static void main(String[] args) {
        new Main("Command Pattern Sample");
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        if (e.getSource() == clearButton) {
            history.clear();
            canvas.init();
            canvas.repaint();
        } else if (e.getSource() == redButton) {
            Command cmd = new ColorCommand(canvas, Color.red);
            history.append(cmd);
            cmd.execute();
        } else if (e.getSource() == greenButton) {
            Command cmd = new ColorCommand(canvas, Color.green);
            history.append(cmd);
            cmd.execute();
        } else if (e.getSource() == blueButton) {
            Command cmd = new ColorCommand(canvas, Color.blue);
            history.append(cmd);
            cmd.execute();
        } else if (e.getSource() == undoButton) {
            history.undo();
            canvas.repaint();
        }
    }
}
