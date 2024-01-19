package com.dsAlgo.practise;

import java.util.Scanner;

public class DimmondPattern {
    public static void main(String[] args) {
        Scanner sc =new Scanner(System.in);
        int n=sc.nextInt();
        printDiamond(n);
        sc.close();
    }
    static void printDiamond(int n)
    {
        System.out.println();
        int i, j = 0;
        for(i=1; i<2*n;i++){
            System.out.print("*");
        }
        System.out.println();
        for (i = 1; i < n; i++) {
 
            for (j = i; j < n; j++)
                System.out.print("*");
 
            for (j=1 ; j<i+1; j++)
                System.out.print(" ");
            
            for(j=1;j<i;j++)
                System.out.print(" ");
 
            for (j = i; j < n; j++)
                System.out.print("*");
 
            System.out.println();
        }
        for(i=2;i<n;i++){
            for(j=1;j<=i;j++)
                System.out.print("*");
            for(j=i;j<n;j++)
                System.out.print(" ");
            for(j=i;j<n-1;j++)
                System.out.print(" ");
            for(j=1;j<=i;j++)
                System.out.print("*");
            System.out.println();
        }
        for(i=1; i<2*n;i++){
            System.out.print("*");
        }
    }
        
}