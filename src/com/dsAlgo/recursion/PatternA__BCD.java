package com.dsAlgo.recursion;

import java.util.Scanner;

public class PatternA__BCD {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n= sc.nextInt();
        patternPrint(n,0);
    }

    private static void patternPrint(int n,int space) {
        if(n==0)return;
        patternPrint(n-1,space+1);
        while(space>0){
            System.out.print(" ");
            space--;
        }
        while (n>0){
            System.out.print("* ");
            n--;
        }
        System.out.println();
    }
}
