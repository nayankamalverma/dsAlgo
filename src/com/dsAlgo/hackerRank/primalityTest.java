package com.dsAlgo.hackerRank;

import java.util.Scanner;

public class primalityTest {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println(sc.nextBigInteger().isProbablePrime(1)?"prime":"not prime");
    }
}
