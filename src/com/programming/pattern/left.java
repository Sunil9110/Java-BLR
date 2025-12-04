package com.programming.pattern;

public class left {
    public static void main(String[] args) {
        int n =3;

        for(int row = 1; row<=n; row++){
            for(int col = 1; col<=row; col++){
                if(col == 1)
                    System.out.println("*");
            }
        }
    }
}
