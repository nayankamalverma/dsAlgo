package com.dsAlgo.array;

import java.util.Arrays;
import java.util.Scanner;

public class basicArray {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n= sc.nextInt();
        int arr[] = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
            System.out.print(arr[i] + " ");
        }
        System.out.println("\n");
        for (int i:arr) {
            System.out.print(i+ "  ");

        }
        System.out.println("\n");
        System.out.println(Arrays.toString(arr));
        sc.close();
    }
}
