package com.dsAlgo.leetCode.binarySearch;

public class infiniteArray {
    public static void main(String[] args) {
        int[] arr= new int[]{1,2,3,5,7,8,9,11,13,14,16,17,18,20,25,28,30,33,35,38,39,42,43,46,49,51,53,55,56,60,62,78};
        int target = 55;
        System.out.println(SearchInfiniteArray(arr,target));
    }

    private static int SearchInfiniteArray(int[] arr, int target) {
        int s=0,e=1;
        while(arr[e]<target){
            int newStart=e+1;
            e = e+(e-s+1)*2;
            s=newStart;
        }
        return search(arr,target,s,e);
    }

    public static int search(int[] arr,int target,int start,int end){
        while(start<=end){
            int mid=start+(end-start)/2;
            if(arr[mid]>target){
                end=mid-1;
            }else if(arr[mid]<target){
                start=mid+1;
            }else{
                return mid;
            }
        }
        return -1;
    }
}
