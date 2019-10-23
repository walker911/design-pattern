package com.walker.design.decorator;

/**
 * @author walker
 * @date 2019/3/29
 */
public class Client {
    public static void main(String[] args) {
        AbstractSchoolReport schoolReport = new FourthGradeSchoolReport();
        schoolReport = new HighScoreDecorator(schoolReport);
        schoolReport = new SortDecorator(schoolReport);
        schoolReport.report();
        schoolReport.sign("name");
    }
}
