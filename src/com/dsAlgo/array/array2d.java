package com.dsAlgo.array;

import java.util.Arrays;
import java.util.Scanner;

public class array2d {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int r,c;
        System.out.print("Enter no. of rows and column: ");
        r = sc.nextInt();
        int[][] arr = new int[r][];
        for (int i = 0; i < arr.length; i++) {
            c = sc.nextInt();
            arr[i]= new int[c];
            for (int j = 0; j < arr[i].length; j++) {
                arr[i][j] = sc.nextInt();
            }
        }
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[i].length; j++) {
                System.out.print(arr[i][j]+"  ");
            }
            System.out.println();
        }
        for (int[] i : arr) {
            System.out.println(Arrays.toString(i));
        }
        sc.close();
    }
}
