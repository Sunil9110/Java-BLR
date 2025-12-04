package com.programming.pattern.Diagnal;

public class Mainclass {
    public static void main(String[] args) {
        int n = 3;

        for(int row = 1; row <=n*2-1; row++){
            for(int col = 1; col <=n*2-1; col++){
                if( row+col>=n+1 && col-row<=n-1 && row-col<=n-1 && row+col==n*3-1 ) {
                    System.out.print(" * ");
                }
                else
                {
                    System.out.print("");
                }
            }
            System.out.println();
        }

    }
}
