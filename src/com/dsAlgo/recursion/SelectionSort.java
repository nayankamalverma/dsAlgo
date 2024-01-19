package com.dsAlgo.recursion;

import java.util.Arrays;

public class SelectionSort {
    public static void main(String[] args) {
        int[] arr={67,43,97,45,45,5,2,3,1,4};
        recSelectionSort(arr,0);
        System.out.println(Arrays.toString(arr));
    }

    private static void recSelectionSort(int[] arr,int i){
        if(i==arr.length-2)return;
        int last=arr.length-i-1;
        boolean noSwap=true;
        for(int j=0;j<last;j++){
            if(arr[j]>arr[last]){
                int temp=arr[j];
                arr[j]=arr[last];
                arr[last]=temp;
                noSwap=false;
            }
        }
        if(noSwap)return;
        recSelectionSort(arr, i+1);
    }
}