package com.dsAlgo.sorting;

/*
*
*   When number are in range 0 to n ==> Cyclic Sort
*       eg==> arr[]{3,5,2,1,4};
*
*       Time Complexity
*       * best Case ==> O(N);
*       * Worst Case ==> O(N;
*
*  */

import java.util.Arrays;

public class CycleSort {
    public static void main(String[] args) {
        int[] arr ={4,3,2,7,8,2,3,1};
        cyclicSort(arr);
        System.out.println(Arrays.toString(arr));
    }

    static void cyclicSort(int[] arr) {
        int i=0;
        while(i<arr.length){
            int value =arr[i]-1;
            if(arr[i]!=arr[value]){
                int temp = arr[i];
                arr[i]=arr[value];
                arr[value] =temp;
            }else{
                i++;
            }
        }
    }
}
