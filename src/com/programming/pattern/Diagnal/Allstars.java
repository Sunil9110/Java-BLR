package com.programming.pattern.Diagnal;

public class Allstars {
    public static void main(String[] args) {
        int n = 3;

        for (int row = 1; row <=n; row++) {
            for (int col = 1; col <=n; col++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }
}
