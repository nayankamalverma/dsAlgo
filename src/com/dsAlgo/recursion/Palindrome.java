package com.dsAlgo.recursion;

public class Palindrome {
    public static void main(String[] args) {
        int n=1214;
        int i=(int)(Math.log10(n)+1);
        System.out.println(isPalindrome(n));
    }

    private static boolean isPalindrome(int n) {
        return n==rev(n);
    }

    static int rev(int n){
        int digits=(int)(Math.log10(n)+1);
        return helper(n,digits);
    }
    private static int helper(int n, int digits) {
        if(n%10==n)return n;
        return (int) ((n%10)*Math.pow(10,digits-1)+helper(n/10,--digits));
    }
}
