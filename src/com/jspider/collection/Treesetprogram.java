package com.jspider.collection;

import java.util.TreeSet;

public class Treesetprogram {
    public static void main(String[] args) {
        TreeSet<String> ts1 = new TreeSet<>();
        ts1.add("B");
        ts1.add("B");
        ts1.add("D");
        ts1.add("A");
        ts1.add("E");
        ts1.add("C");

        for (String value : ts1){
            System.out.println(value);
        }
    }
}
