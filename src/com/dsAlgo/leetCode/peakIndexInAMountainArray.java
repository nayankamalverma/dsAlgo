
//https://leetcode.com/problems/peak-index-in-a-mountain-array
package com.dsAlgo.leetCode;

public class peakIndexInAMountainArray {

//    Using Binary search
    public int peakIndexInMountainArray(int[] arr) {
        int m,s=0,e=arr.length-1;
        while(s<e){
            m=s+(e-s)/2;
            if(arr[m]<arr[m+1]){
                s=m+1;
            }
            else{
                e=m;
            }
        }
        return s;
    }

//    Using linear Search
//    public int peakIndexInMountainArray(int[] arr) {
//        for (int i = 1; i < arr.length; ++i) {
//            if (arr[i - 1] < arr[i] && arr[i] > arr[i + 1]) {
//                return i;
//            }
//        }
//        return -1;
//    }
}
