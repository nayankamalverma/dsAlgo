package com.dsAlgo.recursion;

public class ProductOfDigit {
    public static void main(String[] args) {
        int num=1342;
        System.out.println(prodOfDig(num));
    }
    private static int prodOfDig(int n){
        if(n%10==n)return n;
        return (n%10)*prodOfDig(n/10);
    }

}
