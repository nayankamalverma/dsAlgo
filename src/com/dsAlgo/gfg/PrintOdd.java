package com.dsAlgo.gfg;

public class PrintOdd {
    public static void main(String[] args) {
        int n=100;
        for (int i = 1; i <= n ; i++) {
            if(i%2==1)
                System.out.print(i+" ");
        }
    }
}
