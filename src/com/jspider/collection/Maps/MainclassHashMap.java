package com.jspider.collection.Maps;

import java.util.HashMap;

public class MainclassHashMap {
    public static void main(String[] args) {
        HashMap<Integer, String> hm1 = new HashMap<Integer, String>();
        hm1.put(1, "one");
        hm1.put(2, "two");
        hm1.put(3, null);
        hm1.put(4, "four");
        hm1.put(3, "five");
        hm1.put(null, "six");
        hm1.put(6, "six");
        hm1.put(7, "seven");

        System.out.println("hm1: " + hm1);
    }
}
