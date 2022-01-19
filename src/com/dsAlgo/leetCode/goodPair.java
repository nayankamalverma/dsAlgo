package com.dsAlgo.leetCode;

import java.util.Scanner;

public class goodPair {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt(),cnt=0;
        int[] arr = new int[n];
        for (int i = 0; i < arr.length; i++) {
            arr[i] = sc.nextInt();
        }
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < i; j++) {
                if (i==j)
                    continue;
                else if(arr[i]==arr[j])
                    cnt++;
            }
        }
        System.out.println(cnt);
    }
}
