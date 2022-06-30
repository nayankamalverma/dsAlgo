package com.dsAlgo.leetCode.binarySearch;

import java.util.Arrays;

public class DuplicateZero {
    public static void main(String[] args) {
        int[] arr = new int[]{1,2,0,4,3,0,5};
        duplicateZeros(arr);
        System.out.println(Arrays.toString(arr));
    }
    public static void duplicateZeros(int[] arr) {
        for(int i=0;i<arr.length-1;i++){
            if(arr[i]==0){
                for(int k=arr.length-1;k>i+1;k--){
                    arr[k]=arr[k-1];
                }
                arr[i+1]=0;
                i++;
            }
        }
    }
}
