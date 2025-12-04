package com.programming.pattern;

public class Round {
    public static void main(String[] args) {
        int n = 3;
        for(int row=1; row<=n*2-1; row++){
            for(int col=1; col<=n; col++){
                if(row+col>=n){
                    System.out.print("a");
                }
                else{
                    System.out.print(" ");
                }

            }
            System.out.println();
        }
    }
}



