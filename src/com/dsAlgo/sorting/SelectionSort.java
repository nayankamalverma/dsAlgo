package com.dsAlgo.sorting;

import java.util.Arrays;

/*
        Time complexity
    -> best case  O(n^2);
    -> worst case O(n^2);

    Space complexity
    -> O(1);

    Stability=> not stable
* */

public class SelectionSort {
    public static void main(String[] args) {
        int[] arr= new int[]{5,2,3,1,4};
        selectionSort(arr);
        System.out.println(Arrays.toString(arr));
    }

    private static void selectionSort(int[] arr) {
        for (int i = 0; i < arr.length; i++) {
            int last = arr.length-i-1;
            int maxIndex = searchMax(arr,0,last);
            //swapping MaxValue with value at last index
            int temp =arr[last];
            arr[last]=arr[maxIndex];
            arr[maxIndex]=temp;
        }
    }

    private static int searchMax(int[] arr, int i, int last) {
        int max=i;
        for (int j = 0; j <=last; j++) {
            if(arr[max]<arr[j]){
                max=j;
            }
        }
        return max;
    }
}
