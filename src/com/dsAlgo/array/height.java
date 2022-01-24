package com.dsAlgo.array;

import java.util.Arrays;
import java.util.Scanner;

public class height {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n= sc.nextInt();
        int arr[] = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }
        int[] b=new int[n];
        for (int i = 0; i < n; i++) {
            b[i]=arr[i];
        }
        Arrays.sort(b);
        System.out.println(Arrays.toString(arr));
        System.out.println(Arrays.toString(b));
    }
}
