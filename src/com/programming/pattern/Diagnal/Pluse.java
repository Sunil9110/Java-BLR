package com.programming.pattern.Diagnal;

public class Pluse {
    public static void main(String[] args) {
        int n=3;

        for (int row=1; row<=n; row++){
            for (int col=1; col<=n;col++){
               if(col==(n+1)/2 || row==(n/2)+1)
                   System.out.print("*"+"");
               else
                   System.out.print(" ");
            }
            System.out.println();
        }
    }
}
