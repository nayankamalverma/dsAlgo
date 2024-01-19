package com.dsAlgo.recursion;

public class ArrayBasicQuestions {
    public static void main(String[] args) {
        int[] arr={1,2,3,4,8,6,9,11,10};
//        System.out.println(isSorted(arr,0));
        int target=5;
        System.out.println(linearSearch(arr,target, 0));
    }

    private static boolean isSorted(int[] arr,int i) {
        if(i+1==arr.length-1)return true;
        if(arr[i]>arr[i+1]) return false;
        return isSorted(arr, ++i);
    }

    private static int linearSearch(int[] arr,int tar,int i){
        if(i==arr.length) return -1;
        if(arr[i]==tar) return i;
        return linearSearch(arr, tar, ++i);
    }

//    private static boolean isSorted(int[] arr,int i) {
//        if(i==arr.length-1)return true;
//        return arr[i]<arr[i+1] && isSorted(arr, ++i);
//    }
}
