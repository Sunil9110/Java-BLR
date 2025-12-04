package com.jspider.collection;
import  java.util.Comparator;
import java.util.TreeSet;

 class DescOrder implements Comparator<String> {
     //public class TreeComparator implements Comparator<String> Treesetprogram{
        @Override
        public int compare(String s1, String s2) {
        int v1=s2.compareTo(s1);
        return v1;
        }
    }
    public class Treesetprogram2{
    public static void main(String[] args) {
        System.out.println("program start");
        DescOrder d1=new DescOrder();
        TreeSet<String> ts1=new TreeSet<>(d1);
        ts1.add("B");
        ts1.add("A");
        ts1.add("C");
        ts1.add("D");
        ts1.add("E");
        ts1.add("F");
        for(String s: ts1){
            System.out.println(s);
        }

        System.out.println("program end");
    }
}
