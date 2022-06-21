package com.dsAlgo.hackerRank;

import java.util.ArrayList;
import java.util.Scanner;

public class DiagonalSumSquareMatrix {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n= sc.nextInt();
        ArrayList<ArrayList<Integer>> arr = new ArrayList<>();
        for (int i = 0; i < n; i++) {
            arr.add(new ArrayList<>());
        }
        for (int i = 0; i < n; i++) {
            for (int j = 0; j <n; j++) {
                arr.get(i).add(sc.nextInt());
            }
        }
        System.out.println(diagonalSum(arr));
    }

    private static int diagonalSum(ArrayList<ArrayList<Integer>> arr) {
        int sum=0;
        for(int i=0,j=0;i< arr.size();i++,j++){
            sum+=arr.get(i).get(j);
            sum+=arr.get(i).get(arr.size()-1-j);
        }
        return sum;
    }
    private static int diagonalSumDifference(ArrayList<ArrayList<Integer>> arr) {
        int sum1=0,sum2=0;
        for(int i=0,j=0;i< arr.size();i++,j++){
            sum1+=arr.get(i).get(j);
            sum2+=arr.get(i).get(arr.size()-1-j);
        }
        return Math.abs(sum1-sum2);
    }
}
