package com.programming;

public class Strong {
    public static void main(String[] args) {
        int num = 145;
        int OriginalNum = num;
        int sum = 0;

        while (num > 0){
            int digit = num%10;
            sum += factorial(digit);
            num = num/10;
        }
        if (sum == OriginalNum){
            System.out.println(OriginalNum + " is a strong number");
        }
        else{
            System.out.println(OriginalNum + " is not a strong number");
        }
    }
    static int factorial(int n){
        int fact = 1;
        for (int i = 1; i <= n; i++){
            fact *= i;
        }
        return fact;
    }
}
