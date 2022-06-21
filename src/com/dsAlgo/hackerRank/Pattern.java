package com.dsAlgo.hackerRank;

import java.util.Scanner;

public class Pattern {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n= sc.nextInt();
        printStairCase(n);
    }

    private static void printStairCase(int n) {
        int space=n;
        for(int i=1;i<=n;i++){
            for(int j=1;j<space;j++){
                System.out.print(" ");
            }
            space--;
            for(int k=1;k<=i;k++){
                System.out.print("*");
            }
            System.out.println();
        }
    }
}
