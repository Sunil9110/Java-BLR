package com.jspider.javaimpexample;

public class Hashcode {
    public static void main(String[] args) {
        String s1="java";
        String s2= new  String("java");
        System.out.println(s1.hashCode()==s2.hashCode());
        String s3=new String("java");
        System.out.println(s1.hashCode()==s3.hashCode());
        System.out.println(s1.toString());
    }
}
