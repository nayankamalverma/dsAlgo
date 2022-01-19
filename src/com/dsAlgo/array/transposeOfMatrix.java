package com.dsAlgo.array;

import java.util.Arrays;
import java.util.Scanner;

public class transposeOfMatrix {
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
            mat = transpose(mat);
        for (int[] i : mat) {
            System.out.println(Arrays.toString(i));
        }
            sc.close();
        }

    static int[][] transpose(int[][] mat) {
//        int temp=0;
        for (int i = 0; i < mat.length; i++) {
            for (int j = 1+i; j < mat[i].length; j++) {
//                temp = mat[i][j];
//                mat[i][j]=mat[j][i];
//                mat[j][i]=temp;
                 mat[i][j]=mat[i][j]+mat[j][i];
                 mat[j][i]=mat[i][j]-mat[j][i];
                 mat[i][j]=mat[i][j]-mat[j][i];
            }
        }
        return mat;
    }
}
