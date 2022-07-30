package com.dsAlgo.recursion;

public class Pattern53124 {
    public static void main(String[] args) {
        printPattern53124(5);
    }
    public static void printPattern53124(int n){
        if(n==0)return;
        if(n%2!=0){
            System.out.println(n);
        }
        printPattern53124(n-1);
        if(n%2==0){
            System.out.println(n);
        }
    }
}
