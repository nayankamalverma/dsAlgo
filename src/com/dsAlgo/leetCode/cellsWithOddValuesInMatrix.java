


package com.dsAlgo.leetCode;

import java.util.Arrays;
import java.util.Scanner;

public class cellsWithOddValuesInMatrix {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int arr[][], r,c;
        System.out.print("Enter no. of rows and column: ");
        r = sc.nextInt();
        c = sc.nextInt();
        arr = new int[r][c];
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[i].length; j++) {
                arr[i][j] = sc.nextInt();
            }
        }
        System.out.println(Arrays.toString(arr));
        System.out.println(oddCells(r,c,arr));
    }
    public static int oddCells(int m, int n, int[][] indices) {
        int cnt=0;
        int[][] arr =new int[m][n];
//        for(int i=0;i<m;i++){
//            for(int j=0;j<n;j++){
//
//            }
//        }
        System.out.println(Arrays.toString(arr));
        return cnt;
    }
}
