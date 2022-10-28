package com.dsAlgo.sorting;

import java.util.Arrays;
import java.util.Collections;

public class InsertionSort {
    public static void main(String[] args) {
        int[] arr= new int[]{3,30,34,9,5};
        insertionSort(arr);
        System.out.println(Arrays.toString(arr));
    }

    private static void insertionSort(int[] arr) {
        for (int i = 0; i < arr.length-1 ; i++) {
            for (int j = i+1; j >0 ; j--) {
                if(Long.parseLong(arr[j-1]+arr[j]+"")>=Long.parseLong(arr[j]+arr[j-1]+"")){
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
//    }
}

