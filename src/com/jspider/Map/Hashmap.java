package com.jspider.Map;
import java.util.HashMap;
import java.util.HashSet;

public class Hashmap {
    public static void main(String[] args) {
        HashMap<Integer,String> h= new HashMap();

        h.put(1,"virat");
        h.put(3,"ram");
        h.put(2,"smith");
        h.put(null,"klm");
        h.put(2,"smith");

        System.out.println(h);

    }
}
