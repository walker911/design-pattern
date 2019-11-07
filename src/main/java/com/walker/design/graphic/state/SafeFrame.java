package com.walker.design.graphic.state;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

/**
 * @author walker
 * @date 2019/11/7
 */
public class SafeFrame extends JFrame implements Context, ActionListener {

    private JTextField textClock = new JTextField(60);
    private JTextArea textScreen = new JTextArea(10, 60);
    private JButton buttonUse = new JButton("使用金库");
    private JButton buttonAlarm = new JButton("按下警铃");
    private JButton buttonPhone = new JButton("正常通话");
    private JButton buttonExit = new JButton("结束");

    private State state = DayState.getInstance();

    public SafeFrame(String title) {
        super(title);
        super.setBackground(Color.lightGray);
        super.setLayout(new BorderLayout());

        super.add(textClock, BorderLayout.NORTH);
        textClock.setEditable(false);

        super.add(textScreen, BorderLayout.CENTER);
        textScreen.setEditable(false);

        JPanel panel = new JPanel();
        panel.add(buttonUse);
        panel.add(buttonAlarm);
        panel.add(buttonPhone);
        panel.add(buttonExit);
        super.add(panel, BorderLayout.SOUTH);

        super.pack();
        super.setVisible(true);

        buttonUse.addActionListener(this);
        buttonAlarm.addActionListener(this);
        buttonPhone.addActionListener(this);
        buttonExit.addActionListener(this);
    }

    @Override
    public void setClock(int hour) {
        String clockString = "现在时间是";
        if (hour < 10) {
            clockString += "0" + hour + ":00";
        } else {
            clockString += hour + ":00";
        }
        System.out.println(clockString);
        textClock.setText(clockString);
        state.doClock(this, hour);
    }

    @Override
    public void changeState(State state) {
        System.out.println("从" + this.state + "状态变为了" + state + "状态。");
        this.state = state;
    }

    @Override
    public void callSecurityCenter(String msg) {
        textScreen.append("call!" + msg + "\n");
    }

    @Override
    public void recordLog(String msg) {
        textScreen.append("record..." + msg + "\n");
    }

    @Override
    public void actionPerformed(ActionEvent event) {
        System.out.println(event.toString());
        if (event.getSource() == buttonUse) {
            state.doUse(this);
        } else if (event.getSource() == buttonAlarm) {
            state.doAlarm(this);
        } else if (event.getSource() == buttonPhone) {
            state.doPhone(this);
        } else if (event.getSource() == buttonExit) {
            System.exit(0);
        } else {
            System.out.println("?");
        }
    }
}
