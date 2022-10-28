package com.dsAlgo.recursion;

public class ReverseDigit {



    public static void main(String[] args) {
        int num = 12345;
        System.out.println(rev1(num));
        rev2(num);
        System.out.println(sum);
    }

    static int rev1(int n){
        int digits=(int)(Math.log10(n)+1);
        return helper(n,digits);
    }

    private static int helper(int n, int digits) {
        if(n%10==n)return n;
        return (int) ((n%10)*Math.pow(10,digits-1)+helper(n/10,--digits));
    }
    static int sum=0;
    static void rev2(int n){
        if(n==0){
            return ;
        }
        sum= (sum*10)+n%10;
        rev2(n/10);
    }

}
