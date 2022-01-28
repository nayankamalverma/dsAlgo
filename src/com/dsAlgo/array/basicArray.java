package com.dsAlgo.array;

import com.dsAlgo.practise.search;

import java.util.Arrays;
import java.util.Scanner;

public class basicArray {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n= sc.nextInt();
        int[] arr = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }
        System.out.println("\n");
        for (int i:arr) {
            System.out.print(i+ "  ");

        }
        System.out.println("\n");
        System.out.println(Arrays.toString(arr));
        System.out.println("Enter element to be searched: ");
        int target=sc.nextInt();
        System.out.println("index of element is "+ search.binarySearch(arr,target) );
        sc.close();
    }
}
