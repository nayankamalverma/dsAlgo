package com.dsAlgo.sorting;

import java.util.Arrays;

public class InsertionSort {
    public static void main(String[] args) {
        int[] arr= new int[]{2,1,5,1,3};
        insertionSort(arr);
        System.out.println(Arrays.toString(arr));
    }

    private static void insertionSort(int[] arr) {
        for (int i = 0; i < arr.length-1 ; i++) {
            for (int j = i+1; j >0 ; j--) {
                if(arr[j-1]<arr[j]){
                    break;
                }else{
                    int temp =arr[j];
                    arr[j]=arr[j-1];
                    arr[j-1]=temp;
                }
            }
        }
    }

//    private static void swap(int[] arr,int i,int j){
//
//    }
}
