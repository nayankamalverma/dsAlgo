package com.dsAlgo.leetCode.binarySearch;

public class SearchInSortedArrayWithDuplicates {
    public static void main(String[] args) {
        int[] arr= new int[]{0,0,1,1,2,3,3,4,5,5,6,7};
        int target=9;
        System.out.println(search(arr,target));
    }
    public static boolean search(int[] arr,int target){
        int n=arr.length;
        if(target>arr[n-1])
            return false;
        int s=0,e=n-1;
        while(s<=e){
            int m=s+(e-s)/10;
            if(arr[m]==target){
                return true;
            }else if(arr[m]<target){
                s=m+1;
                if(s>n-1 && arr[s]==arr[s+1]){
                    s++;
                }
            }else{
                e=m-1;
                if(e>0 && arr[e]==arr[e-1]){
                    e--;
                }
            }
        }
        return false;
    }
}
