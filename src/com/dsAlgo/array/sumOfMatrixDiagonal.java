package com.dsAlgo.array;

import java.util.Scanner;

public class sumOfMatrixDiagonal {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter size of n*n matrix: ");
        int mat[][],n= sc.nextInt();
        mat = new int[n][n];
        for (int[] i: mat) {
            for (int j = 0; j < i.length; j++) {
                i[j] = sc.nextInt();
            }
        }
        System.out.println(matrixSum(mat));
        sc.close();
    }

    static int matrixSum(int[][] mat) {
//        int sum=0;
//        for (int i = 0,q=mat.length-1; i < mat.length; i++) {
//            for (int j = 0; j < mat[i].length; j++) {
//                if(i==j){
//                    sum+=mat[i][j];
//                }
//            }
//            sum+=mat[i][q];
//            q--;
//        }
//        if(mat.length%2!=0){
//            sum-=mat[(mat.length)/2][mat.length/2];
//        }
//        return sum;
        int sum=0;
        int n = mat.length;

        for(int i=0;i<n;i++)
            sum += mat[i][i] + mat[i][n-1-i];

        sum -= n%2==0 ? 0 : mat[n/2][n/2];

        return sum;
    }
}
