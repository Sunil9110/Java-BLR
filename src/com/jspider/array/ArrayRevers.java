package com.jspider.array;
import java.util.Arrays;

public class ArrayRevers {
    public static void main(String[] args) {
        System.out.println("program start...");
        int[] a={10,20,30,40,50};

        int st=0, end=a.length-1;
        while(st<end){
            int temp=a[st];
            a[st]=a[end];
            a[end]=temp;
            st++;
            end--;
        }
        System.out.println(Arrays.toString(a));
        System.out.println("program ends...");
    }
}
