package com.walker.design.graphic.abstraction;

import com.walker.design.graphic.abstraction.factory.Factory;
import com.walker.design.graphic.abstraction.factory.Link;
import com.walker.design.graphic.abstraction.factory.Page;
import com.walker.design.graphic.abstraction.factory.Tray;

/**
 * @author walker
 * @date 2019/10/30
 */
public class Main {
    public static void main(String[] args) {
        Factory factory = Factory.getFactory("com.walker.design.graphic.abstraction.list.ListFactory");

        Link people = factory.createLink("人民日报", "http://www.people.com.cn/");
        Link gmw = factory.createLink("光明日报", "http://www.gmw.cn/");

        Link usYahoo = factory.createLink("Yahoo!", "http://www.yahoo.com");
        Link jpYahoo = factory.createLink("Yahoo!Japan", "http://www.yahoo.co.jp");
        Link excite = factory.createLink("Excite", "http://www.excite.com");
        Link google = factory.createLink("Google", "http://www.google.com");

        Tray trayNews = factory.createTray("日报");
        trayNews.add(people);
        trayNews.add(gmw);

        Tray trayYahoo = factory.createTray("Yahoo!");
        trayYahoo.add(usYahoo);
        trayYahoo.add(jpYahoo);

        Tray traySearch = factory.createTray("检索引擎");
        traySearch.add(trayYahoo);
        traySearch.add(excite);
        traySearch.add(google);

        Page page = factory.createPage("LinkPage", "杨文轩");
        page.add(trayNews);
        page.add(traySearch);
        page.output();


    }
}
