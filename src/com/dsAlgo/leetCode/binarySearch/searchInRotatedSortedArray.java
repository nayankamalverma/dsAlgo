
//https://leetcode.com/problems/search-in-rotated-sorted-array/

package com.dsAlgo.leetCode.binarySearch;

public class searchInRotatedSortedArray {
    public static void main(String[] args) {
            int[] arr={4,5,6,7,0,1,2};
        System.out.println( search(arr,3));
    }

    public static int search(int[] nums, int target) {
        int p = searchPivot(nums);
        if(p==-1){
            return binarySearch(nums,target,0,nums.length-1);
        }else if(nums[p]==target){
            return p;
        }else if(target>=nums[0]){
            return binarySearch(nums,target,0,p-1);
        }
        return binarySearch(nums,target,p+1,nums.length-1);
    }

    public static int binarySearch(int[] arr,int target,int s, int e){

        while(s <=e){
            int m=s+(e-s)/2;
            if(arr[m]==target){
                return m;
            }else if(arr[m]<target){
                s=m+1;
            }else{
                e=m-1;
            }
        }
        return -1;
    }

    public static int searchPivot(int[] arr){
        int s=0,e=arr.length-1;
        while(s<=e){
            int m=s+(e-s)/2;
            if(m<e && arr[m]>arr[m+1]){
                return m;
            }if(m>s && arr[m]<arr[m-1]){
                return m-1;
            }if(arr[s]<arr[m]){
                s=m+1;
            }else{
                e=m-1;
            }
        }
        return -1;
    }

}
