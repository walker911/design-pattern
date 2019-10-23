package com.walker.design.zen.iterator;

/**
 * @author walker
 * @date 2019/3/26
 */
public class Client {
    public static void main(String[] args) {
        IProject projects = new ProjectImpl();
        for (int i = 1; i < 6; i++) {
            projects.add("第" + i + "个项目", i * 5, i * 10000);
        }
        IProjectIterator iterator = projects.iterator();
        while (iterator.hasNext()) {
            IProject project = (IProject) iterator.next();
            System.out.println(project.getProjectInfo());
        }
    }
}
