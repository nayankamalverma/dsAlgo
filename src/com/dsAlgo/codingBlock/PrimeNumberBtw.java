package com.dsAlgo.codingBlock;

import java.util.Scanner;

public class PrimeNumberBtw {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter lower bound: ");
        int lo= sc.nextInt();
        System.out.println("Enter upper bound: ");
        int up= sc.nextInt();
        System.out.println("Prime number between "+lo+" & "+up+" are: ");
        printPrime(lo,up);
    }

    private static void printPrime(int lo, int up) {
        for( ;lo<=up;lo++) {
            int flag=1;
            if(lo==1||lo==0)
                continue;
            for(int i=2;i<lo;i++){
                if (lo % i == 0) {
                    flag = 0;
                    break;
                }
            }
            if(flag==1){
                System.out.print(lo +" ");
            }
        }
    }
}
