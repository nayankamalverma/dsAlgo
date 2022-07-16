package com.dsAlgo.codingBlock;

import java.math.BigInteger;

public class Factorial {
    public static void main(String[] args) {
        int n=100;
        System.out.println(fact(n));
    }

//    private static long fact(long n) {
//        if(n<=1) {
//            return 1;
//        }
//        return n*fact(n-1);
//    }
    private static BigInteger fact(long n) {
        BigInteger result = BigInteger.ONE;
        for (long i = 2; i <= n; i++)
            result = result.multiply(BigInteger.valueOf(i));
        return result;
    }
}
