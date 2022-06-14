package com.dsAlgo.codingBlock;

import java.util.Scanner;

public class SumOfFirstAndLast {
    public static void main (String[] Args){
        Scanner sc= new Scanner(System.in);
        int n=sc.nextInt();
        while(n>0){
            int x= sc.nextInt();
            int first = x%10;
            String s = Integer.toString(x);
            int last = Integer.parseInt(String.valueOf(s.charAt(0)));
            System.out.println(first+last);
            n--;
        }
    }
}