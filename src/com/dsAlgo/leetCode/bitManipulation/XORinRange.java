package com.dsAlgo.leetCode.bitManipulation;

import java.util.Scanner;

public class XORinRange{
    public static void main(String[] args) {
        // XOR for range a to b
        Scanner sc = new Scanner(System.in);
        int a= sc.nextInt();
        int b= sc.nextInt();
        int ans= XOR(b)^XOR(a-1);
        System.out.println(ans);
    }

    private static int XOR(int n){
        // XOR for range 0 to n
        if(n%4==0)return n;
        if(n%4==1)return 1;
        if(n%4==2)return n+1;
        return 0;//n%4==3
    }
}
