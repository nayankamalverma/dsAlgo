package com.dsAlgo.recursion;

public class Power {
    public static void main(String[] args) {
        System.out.println(power(2,50));
    }
    public static long power(int n,int x){
        if(x==0){
            return 1;
        }
        return n*power(n,x-1);
    }
}
