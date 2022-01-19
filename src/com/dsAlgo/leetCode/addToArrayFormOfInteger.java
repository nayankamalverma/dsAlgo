package com.dsAlgo.leetCode;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

public class addToArrayFormOfInteger {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n= sc.nextInt();
        int arr[] = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }
        int k= sc.nextInt();
        System.out.println(addToArrayForm(arr,k));
    }
    public static List<Long> addToArrayForm(int[] num, int k) {
        ArrayList<Long> arr=new ArrayList<>();
        long n=0;
        for(int i=0;i<num.length;i++){
            n=n*10+num[i];
        }
        n=n+k;
        while(n!=0){
            arr.add(n%2);
            n=n/10;
        }
        Collections.reverse(arr);
        return arr;
    }
}
