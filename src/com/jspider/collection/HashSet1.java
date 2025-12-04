package com.jspider.collection;

import java.util.HashSet;
public class HashSet1 {
    public static void main(String[] args) {
        System.out.println("program starts");
        HashSet <Integer> set = new HashSet <Integer>();
        set.add(10);
        set.add(20);
        set.add(30);
        set.add(null);
        set.add(20);
        set.add(40);

        for (Integer value : set){
            if(value != null && value % 2 == 0){
                System.out.println(value);
            }
        }
        System.out.println("program ends");
    }
}
