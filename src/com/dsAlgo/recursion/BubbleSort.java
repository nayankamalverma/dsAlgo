package com.dsAlgo.recursion;

import java.util.Arrays;
import java.util.function.Function;

public class BubbleSort {
    public static void main(String[] args) {
        int[] arr= {67,567,345,3,234,25,2,5,55,323,44,234};
        recBubbleSort(arr,0);
        System.out.println(Arrays.toString(arr));
    }

    private static void recBubbleSort(int[] arr,int i){
        if(arr.length==i)return;
        boolean noSwap= true;
        for(int j=1;j<arr.length-1;j++){
            if(arr[j-1]>arr[j]){
                swap(arr, j-1, j);
                noSwap=false;
            }
        }
        if(noSwap)return;
        recBubbleSort(arr, i+1);
    }

    private static void swap(int[] arr,int i,int j){
        int temp=arr[i];
        arr[i]=arr[j];
        arr[j]=temp;
    }
}