package com.dsAlgo.codingBlock;

import java.util.Scanner;

public class ReverseOfNum {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        int n=sc.nextInt();
        for(int i=0;i<n;i++){
            int num=sc.nextInt();
            int temp=num;
            int rev=0;
            while(temp>0){
                rev=rev*10+(temp%10);
                temp/=10;
            }
        }
    }
}
