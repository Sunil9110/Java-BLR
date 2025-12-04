package com.programming;

public class Strong2 {
    public static void main(String[] args) {
        System.out.println("program start");
        int n = 145;
        int sum = 0, temp = n;
        while (n>0){
            int rem = n%10;
            int fact = 1;
            for (int i=rem; i>=1; i--){
                fact *= i;
            }
            sum += fact;
            n /= 10;
        }
        if(sum==temp){
            System.out.println("is a strong number");
        }
        else {
            System.out.println("is not a strong number");
        }
        System.out.println("program end");
    }
}
