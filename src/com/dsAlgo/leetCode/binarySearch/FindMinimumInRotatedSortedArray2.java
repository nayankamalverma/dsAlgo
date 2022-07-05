
//https://leetcode.com/problems/find-minimum-in-rotated-sorted-array-ii

package com.dsAlgo.leetCode.binarySearch;

public class FindMinimumInRotatedSortedArray2 {
    public static void main(String[] args) {
        int[] arr= new int[]{1,1};
        System.out.println(findMin(arr));
    }
    public static int findMin(int[] arr) {
        if(arr.length==0) return -1;
        if(arr.length==1) return arr[0];
        int s=0,e=arr.length-1;
        while(s<e){
            int m=s+(e-s)/2;
            if(m>0 && arr[m-1]>arr[m]){
                return arr[m];
            }else if(arr[s]==arr[m] && arr[m]==arr[e]){
                if(arr[s]>arr[s+1]){
                    return arr[s+1];
                }s++;
                if(arr[e]<arr[e-1]){
                    return arr[e];
                }e++;
            }else if(arr[s]<=arr[m] && arr[m]>arr[e]){
                s=m+1;
            }else{
                e=m-1;
            }
        }
        return arr[s];
    }
//    public int findMin(int[] arr) {
//        int n=arr.length;
//        int s=0,e=n-1;
//        if(e==0 || arr[s]<arr[e]){
//            return arr[0];
//        }if(n==2){
//            return arr[0]>arr[1]?arr[1]:arr[0];
//        }
//        while(s<=e){
//            int m=s+(e-s)/2;
//            if(m>0 && arr[m-1]>arr[m]){
//                return arr[m];
//            }else if(e<arr.length-1 && arr[m]>arr[m+1]){
//                return arr[m+1];
//            }else if(arr[s]==arr[m] && arr[m]==arr[e]){
//                if(arr[s]>arr[s+1]){
//                    return arr[s+1];
//                }else if(arr[e-1]>arr[e]){
//                    return arr[e];
//                }e--;
//                s++;
//            }else if(arr[s]<arr[m] || arr[s]==arr[m] && arr[m]>arr[e]){
//                s=m;
//            }else{
//                e=m-1;
//            }
//        }
//        return arr[e];
//    }
}
