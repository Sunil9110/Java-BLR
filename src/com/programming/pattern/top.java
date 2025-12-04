package com.programming.pattern;

public class top {
    public static void main(String[] args) {
        int n = 3;

        for(int row=1; row<=n;row++){
            for(int col=1; col<=row; col++){
                if(row==n)
                    System.out.print(" * ");
            }
                System.out.print(" ");
        }
    }
}
