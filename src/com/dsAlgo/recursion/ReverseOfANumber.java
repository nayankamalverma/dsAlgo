
package com.dsAlgo.recursion;
import java.util.Scanner;

class ReverseOfANumber{
    public static void main(String[] Args){
        Scanner sc = new Scanner(System.in);
        int n= sc.nextInt();
        ReverseDigit(n);
        System.out.println(rev);
        sc.close();
    }
    static int rev=0;
    private static void ReverseDigit(int n){
        if(n==0) return ;
        rev=rev*10+ n%10;
        ReverseDigit(n/10) ;
    }
}