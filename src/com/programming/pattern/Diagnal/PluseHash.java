package com.programming.pattern.Diagnal;

public class PluseHash {
    public static void main(String[] args) {
        int n = 5;

        for (int row=1; row<=n; row++)
        {
            for(int col=1; col<=n; col++){
                if(row==(n+1)/2 && col==(n+1)/2)
                    System.out.print("#"+" ");
                else if(row==(n+1)/2 || col==(n+1)/2)
                    System.out.print("*");
                else
                    System.out.print(" ");
            }
            System.out.println(" ");
        }
    }
}
