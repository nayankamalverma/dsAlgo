
//https://leetcode.com/problems/missing-number/

package com.dsAlgo.sorting;

import java.util.Arrays;

import static com.dsAlgo.sorting.CycleSort.cyclicSort;

public class MissingNumber {
    public static void main(String[] args) {
        int[] arr ={1,5,2,3,4};
        CycleSort.cyclicSort(arr);
        System.out.println(missingNumber(arr));
    }
    public static int missingNumber(int[] arr) {
        int i=0;
        while(i<arr.length){
            if(arr[i]!=i){
                return i;
            }else{
                i++;
            }
        }
        return arr.length;
    }
}
