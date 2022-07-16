package com.dsAlgo;

import java.util.Scanner;

public class fiboo {
    public fiboo(int i) {
        i=5;
    }

    public static void main(String[] args) {
        int x;
        System.out.print("Enter no. of element in fibbonachi series: ");
        Scanner sc = new Scanner(System.in);
        x = sc.nextInt();
        fibbo(x);
    }

    private static void fibbo(int x) {
        if(x==1){
            System.out.println(0);
        }new fiboo(x--);
        System.out.println(x);
    }

}
