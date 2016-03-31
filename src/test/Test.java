package test;

import algorithm.QuickFind;
import algorithm.SimpleQuickUnion;

public class Test {

    public Test() {
        // TODO Auto-generated constructor stub
    }

    public static void main(String[] args) {
        testQuickFind();

    }

    public static void testQuickFind() {

        QuickFind quickFind = new QuickFind(10);
        quickFind.setPrintState(true);
        quickFind.union(4, 3).union(3, 8).
                union(6, 5).union(9, 4).
                union(2, 1).connected(8, 9);
        quickFind.union(8, 9).connected(5, 0);
        quickFind.union(5, 0).union(7, 2).union(6, 1);
        System.out.println(quickFind.toString());
    }
    
    public static void testSimpleQuickUnion() {

        SimpleQuickUnion quickUnion = new SimpleQuickUnion(10);
        quickUnion.setPrintState(true);
        quickUnion.union(4, 3).union(3, 8).
                union(6, 5).union(9, 4).
                union(2, 1).connected(5, 4);
        quickUnion.union(5, 0).union(7, 2).union(6, 1).union(7, 3);
        System.out.println(quickUnion.toString());
    }

}
