package com.jspider.collection;
import java.util.LinkedList;
public class List {
    public static void main(String[] args) {
        System.out.println("program start");
        LinkedList <Integer> list = new LinkedList<>();
        list.add(10);
        list.add(20);
        list.add(30);
        list.add(40);

        System.out.println("list size" + list.size());

        while(list.isEmpty() == false){
            System.out.println(list.poll());
        }
        System.out.println("list size" + list.size());



        System.out.println("program end");
    }
}
