package com.dsAlgo.sorting;

import java.util.Arrays;

/*
=>Bubble sort
=> sinking sort
=> exchange sort

    Time complexity
    -> best case  O(n);
    -> worst case O(n^2);

    Space complexity
    -> O(1);

    Stability=> stable

* */

public class BubbleSort {
    public static void main(String[] args) {
        int[] arr= new int[]{5,2,4,3,1};
        bubbleSort(arr);
        System.out.println(Arrays.toString(arr));
    }

    private static void bubbleSort(int[] arr) {
        for (int i = 0; i < arr.length; i++) {
            boolean swap=false;
            for (int j = 1; j < arr.length-i; j++) {
                if(arr[j-1]>arr[j]){
                    arr[j] = arr[j]+arr[j-1];
                    arr[j-1]=arr[j]-arr[j-1];
                    arr[j]=arr[j]-arr[j-1];
                    swap=true;
                }
            }
            if(!swap){
                break;
            }
        }
    }
}
