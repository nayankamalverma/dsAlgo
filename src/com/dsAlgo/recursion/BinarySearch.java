package com.dsAlgo.recursion;

public class BinarySearch {
    public static void main(String[] args) {
        int[] arr= {3,4,5,34 ,45,56,57,64,72,81,95,102};
        int target= 72;
        System.out.println(binarySearch(arr, target,0, arr.length));
    }
    private static int binarySearch(int[] arr,int target,int s,int e){
        int mid = s+(e-s)/2;
        if(s>e)return -1;
        if(arr[mid]==target) return mid;
        if(target>arr[mid]) return binarySearch(arr, target, mid+1, e);
        return binarySearch(arr, target, s, mid-1);
    }
}
