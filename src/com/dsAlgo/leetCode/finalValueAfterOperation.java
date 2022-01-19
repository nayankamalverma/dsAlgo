package com.dsAlgo.leetCode;

import java.util.Scanner;

public class finalValueAfterOperation {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n= sc.nextInt();
        String arr[] = new String[n];
        for (int i = 0; i < n; i++) {
            arr[i] = sc.next();
        }
        System.out.println(finalValue(arr));
    }

    static int finalValue(String[] arr) {
        int x=0;
        for (String i: arr) {
//            if("X++".equals(i)||"++X".equals(i)){
//                x++;
//            }
            if(i.charAt(0)=='+'||i.charAt(2)=='+'){
                x++;
            }
            else{
                x--;
            }
        }
        return x;
    }
}
