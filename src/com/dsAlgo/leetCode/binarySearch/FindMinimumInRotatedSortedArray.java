
//https://leetcode.com/problems/find-minimum-in-rotated-sorted-array/

package com.dsAlgo.leetCode.binarySearch;

public class FindMinimumInRotatedSortedArray {
    public static void main(String[] args) {
        int[] arr= new int[]{4,5,6,7,0,1,2};
        System.out.println(findMin(arr));
    }
    public static int findMin(int[] arr) {
        int x=arr[0];
        int s=0,e=arr.length-1;
        if(e==0 || arr[0]<arr[e])return arr[0];
        while(s<=e){
            int m= s+(e-s)/2;
            if(m>0 && arr[m-1]>arr[m]){
                return arr[m];
            } else if(m<arr.length-1 && arr[m]>arr[m+1]){
                return arr[m+1];
            }if(x<arr[m]){
                s=m+1;
            }else{
                e=m-1;
            }
        }
        return -1;
    }
}
