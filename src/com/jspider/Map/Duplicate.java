package com.jspider.Map;

import java.util.Arrays;
import java.util.LinkedHashSet;

public class Duplicate {
    public static void main(String[] args) {
        String [] names ={"ashok", "ramesh","Abhi","ashok"};
        System.out.println(Arrays.toString(names));

        LinkedHashSet l = new LinkedHashSet(Arrays.asList(names));
        System.out.println(l);
    }
}
