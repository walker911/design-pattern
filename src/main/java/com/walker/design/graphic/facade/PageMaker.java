package com.walker.design.graphic.facade;

import java.io.FileWriter;
import java.io.IOException;
import java.util.Properties;

/**
 * @author walker
 * @date 2019/11/4
 */
public class PageMaker {

    private PageMaker() {
    }

    public static void makeWelcomePage(String mailaddr, String filename) {
        Properties mailProperties = Database.getProperties("maildata");
        String username = mailProperties.getProperty(mailaddr);
        try {
            HtmlWriter writer = new HtmlWriter(new FileWriter(filename));
            writer.title("Welcome to " + username + "'s page!");
            writer.paragraph(username + "欢迎来到" + username + "的主页。");
            writer.paragraph("等着你邮件哟！");
            writer.mailto(mailaddr, username);
            writer.close();
            System.out.println(filename + " is created for " + mailaddr + " (" + username + ")");
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public static void makeLinePage(String filename) {
        try {
            Properties mailProperties = Database.getProperties("maildata");
            HtmlWriter writer = new HtmlWriter(new FileWriter(filename));
            writer.title("Link page");
            mailProperties.forEach((k, v) -> {
                try {
                    writer.link(String.valueOf(k), String.valueOf(v));
                } catch (IOException e) {
                    e.printStackTrace();
                }
            });
            writer.close();
            System.out.println(filename + "is created.");
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
