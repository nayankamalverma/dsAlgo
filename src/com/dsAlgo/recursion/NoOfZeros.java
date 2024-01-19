package com.dsAlgo.recursion;

public class NoOfZeros {
    public static void main(String[] args) {
        int n= 3200040;
//        noOfZero1(n);
//        System.out.println(cnt);
        System.out.println(noOfZero2(n));
    }

    private static int noOfZero2(int n) {
        return count(n,0);
    }

    private static int count(int n, int cnt) {
        if(n==0)return cnt;
        if(n%10==0)return count(n/10,++cnt);
        else return count(n/10,cnt);
    }

    static int cnt=0;

    private static void noOfZero1(int n) {
        if(n==0)return;
        if(n%10==0)cnt++;
        noOfZero1(n/10);
    }
}
