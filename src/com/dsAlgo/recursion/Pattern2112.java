package com.dsAlgo.recursion;

/*print pattern
    5
    4
    3
    2
    1
    1
    2
    3
    4
    5
*/

public class Pattern2112 {
    public static void main(String[] args) {
        printPattern(5);
    }

    private static void printPattern(int n) {
        if(n==0) return;
        System.out.println(n);
        printPattern(n-1);
        System.out.println(n);
    }
}
