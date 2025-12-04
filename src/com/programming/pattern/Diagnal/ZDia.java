package com.programming.pattern.Diagnal;

public class ZDia {
    public static void main(String[] args) {
        int n = 3;

        for(int row=1; row<=n; row++){
        for(int col=1; col<=n; col++){
        if(row==1 || row+col==(n+1) || row==n)
            System.out.print("*");
        else
            System.out.print(" ");
        }
            System.out.println();
        }
    }
}
