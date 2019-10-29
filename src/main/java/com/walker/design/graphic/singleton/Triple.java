package com.walker.design.graphic.singleton;

/**
 * 实现最多只能生成3个Triple实例，实例编号分别为0，1，2且
 * 可以通过getInstance(int id)来获取该编号对应的实例
 *
 * @author walker
 * @date 2019/10/29
 */
public class Triple {

    private static Triple[] triples = {new Triple(0), new Triple(1), new Triple(2)};
    private int id;

    private Triple(int id) {
        this.id = id;
    }

    public static Triple getInstance(int id) {
        return triples[id];
    }

    public static void main(String[] args) {
        Triple t0 = Triple.getInstance(0);
        Triple t1 = Triple.getInstance(0);
        System.out.println(t0 == t1);
    }
}
