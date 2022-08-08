package com.dsAlgo.recursion;

public class IsArraySorted {
    public static void main(String[] args) {
        int[] arr = {9,2,3,8,5,6,7};
        int i=0;
        System.out.println(isArraySorted(arr,i));
    }

    private static boolean isArraySorted(int[] arr,int i) {
        if(arr[i]>arr[i+1]){
            return false;
        }
        if(i+1==arr.length-1){
            return true;
        }
        return isArraySorted(arr,i+1);
    }
}
