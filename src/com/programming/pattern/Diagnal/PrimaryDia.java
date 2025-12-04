package com.programming.pattern.Diagnal;

public class PrimaryDia {

    public static void main(String[] args) {
        int n =3;

        for(int row=1; row<=n;row++ ){
            for(int col=1; col<=row; col++){
                if(row == col)
                    System.out.print("*");
                else
                    System.out.print(" ");

            }
            System.out.println(" ");
        }
    }
}

