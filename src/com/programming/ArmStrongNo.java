package com.programming;

import java.util.Scanner;

public class ArmStrongNo {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter a number");
        int n = sc.nextInt();
        int count = 0,temp = n,sum=0;
        while(n>0){
            n/=10;
            count++;

        }
        n=temp;
        while(n>0) {
            int rem = n % 10;
            int pow = 1;
            for (int i = 1; i <= count; i++) {
                pow += rem;
            }
            sum += pow;
            n = n / 10;
            if (temp == sum) {
                System.out.println("It is a arm number");
            }
            else {
                System.out.println("It is not a arm number");
            }

        }



    }
}
