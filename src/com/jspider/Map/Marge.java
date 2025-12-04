package com.jspider.Map;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.LinkedHashMap;

public class Marge {
    public static void main(String[] args) {
        ArrayList<String> keys = new ArrayList<>();
        keys.add("1");
        keys.add("2");

        ArrayList<String> values = new ArrayList();
        values.add("ashok");
        values.add("ramesh");

        LinkedHashMap <String, String> l = new LinkedHashMap<>();
        for (int i = 0; i < keys.size(); i++) {
            l.put(keys.get(i), values.get(i));
        }
        System.out.println(l);
    }
}
