package com.dsAlgo.recursion;

public class Pattern12345 {
    public static void main(String[] args) {
        int num=5;
        printPattern(5);
    }
    public static void printPattern(int num){
        if(num==0){
            return;
        }
        System.out.println(num);
        printPattern(num-1);
    }
}
