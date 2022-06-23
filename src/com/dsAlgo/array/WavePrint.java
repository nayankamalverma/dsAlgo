package com.dsAlgo.array;

import java.util.Scanner;

public class WavePrint {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter no. of rows and column: ");
        int r = sc.nextInt();
        int[][] arr= new int[r][];
        for (int i = 0; i < r; i++) {
            arr[i] =  new int[r];
            for (int j = 0; j <r; j++) {
                arr[i][j] = sc.nextInt();
            }
        }
        System.out.println("======================================");
        printWaveLeftRight(arr);
        System.out.println("======================================");
        printWaveUpDown(arr);
    }

    private static void printWaveUpDown(int[][] arr) {
        for (int i = 0; i < arr.length; i++) {
            if(i%2==0){
                for (int j = 0; j < arr[i].length; j++) {
                    System.out.print(arr[j][i]+" ");
                }
            }else {
                for (int j = arr[i].length-1; j >=0 ; j--) {
                    System.out.print(arr[j][i]+" ");
                }
            }
            System.out.println();
        }
    }

    private static void printWaveLeftRight(int[][] arr) {
        for (int i = 0; i <arr.length;i++) {
            if(i%2==0){
                for (int j = 0; j < arr[i].length; j++) {
                    System.out.print(arr[i][j]+" ");
                }
            }else {
                for (int j = arr[i].length-1; j >=0 ; j--) {
                    System.out.print(arr[i][j]+" ");
                }
            }
            System.out.println();
        }
    }
}
