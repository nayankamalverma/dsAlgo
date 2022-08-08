package com.dsAlgo.leetCode.bitManipulation;

import java.util.Scanner;

public class MagicNumber {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        int n= sc.nextInt();
        System.out.println(magicNumber(n));
    }

    private static int magicNumber(int n) {
        int ans=0,i=1;
        while(n!=0){
            int lsb=n&1;
            if(lsb==1){
                ans+=Math.pow(5,i);
            }
            i++;
            n=n>>1;
        }
        return ans;
    }
}
