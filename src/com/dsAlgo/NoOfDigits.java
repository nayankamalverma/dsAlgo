package com.dsAlgo;

public class NoOfDigits {
    public static void main(String[] args) {
        int n=6342645;//6 in binary="110";
        int base = 10;//base of binary no is 2 && decimal is 10
        int digits= (int)(Math.log(n)/Math.log(base))+1;
        System.out.println(digits);
    }
}
