package com.dsAlgo.practise;

import java.util.Scanner;

public class subtractProductAndSum {
    public static void main(String[] args) {
        int n,sum=0,mul=1;
        Scanner sc = new Scanner(System.in);
        n=sc.nextInt();
        while(n!=0){
            sum= sum+(n%10);
            mul= mul*(n%10);
            n=n/10;
        }
        sum = mul - sum;
        System.out.println(sum);
    }
}
