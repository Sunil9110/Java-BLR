package com.jspider.Map;

import java.util.LinkedHashSet;
import java.util.Set;

public class RemoveDup {
    public static void main(String[] args) {
        int [] a={40,92,117,97,92,41};
        Set<Integer> s=new LinkedHashSet<>();
        for (int num:a){
        s.add(num);
        }
    System.out.println(s);

    }
}