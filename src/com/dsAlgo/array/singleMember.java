package com.dsAlgo.array;

import java.util.Arrays;
import java.util.Scanner;

public class singleMember {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int arr[] = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }
        Arrays.parallelSort(arr);
        System.out.println(Arrays.toString(arr));

        }
    }

