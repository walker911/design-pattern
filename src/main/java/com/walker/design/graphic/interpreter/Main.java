package com.walker.design.graphic.interpreter;

import com.walker.design.graphic.interpreter.language.Context;
import com.walker.design.graphic.interpreter.language.InterpreterFacade;
import com.walker.design.graphic.interpreter.language.Node;
import com.walker.design.graphic.interpreter.language.ProgramNode;
import com.walker.design.graphic.interpreter.turtle.TurtleCanvas;

import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;
import java.io.BufferedReader;
import java.io.FileReader;

/**
 * @author walker
 * @date 2019/11/12
 */
public class Main extends Frame implements ActionListener {

    private TurtleCanvas canvas = new TurtleCanvas(400, 400);
    private InterpreterFacade facade = new InterpreterFacade(canvas);
    private TextField programTextField = new TextField("program repeat 3 go right go left end end");

    public Main(String title) {
        super(title);

        canvas.setExecutor(facade);

        super.setLayout(new BorderLayout());

        programTextField.addActionListener(this);

        this.addWindowListener(new WindowAdapter() {
            @Override
            public void windowClosing(WindowEvent e) {
                System.exit(0);
            }
        });

        super.add(programTextField, BorderLayout.NORTH);
        super.add(canvas, BorderLayout.CENTER);
        pack();
        parseAndExecute();
        super.setVisible(true);
    }

    private void parseAndExecute() {
        String programText = programTextField.getText();
        System.out.println("programText = " + programText);
        facade.parse(programText);
        canvas.repaint();
    }

    public static void main(String[] args) {
        new Main("Interpreter Pattern Sample");
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        if (e.getSource() == programTextField) {
            parseAndExecute();
        }
    }
}
