package com.jspider.collection.Maps;

import java.sql.SQLOutput;
import java.util.HashMap;
import java.util.Hashtable;

public class MainclassHashtable {
    public static void main(String[] args) {
        System.out.println("program start");

        Hashtable<Integer, String> ht1 = new Hashtable<Integer, String>();
        ht1.put(1, "A");
        ht1.put(2, "B");
        ht1.put(3, "C");
        ht1.put(4, "D");
        ht1.put(5, "E");
        System.out.print("HASHTABLE  ->");
        System.out.println(ht1);


        System.out.println("program end");
    }
}
