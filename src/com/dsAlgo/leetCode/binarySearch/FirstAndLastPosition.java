
//https://leetcode.com/problems/find-first-and-last-position-of-element-in-sorted-array/

package com.dsAlgo.leetCode.binarySearch;

import java.util.Arrays;

public class FirstAndLastPosition {
    public static void main(String[] args) {
        int[] arr = new int[]{2, 3,7 ,7,7,8,8,9,9};
        int target=8;
        System.out.println(Arrays.toString(firstAndLastPosition(arr,target)));
    }

    private static int[] firstAndLastPosition(int[] arr,int target) {
        boolean isFirst=true;
        int first = search(arr,target,isFirst);
        if(first==-1){
            return new int[]{-1,-1};
        }
        isFirst=false;
        int last = search(arr,target,isFirst);
        return new int[]{first,last};
    }

    public static int search(int[] arr,int target,boolean isFirst){
        int s=0,e=arr.length-1,ans=-1;
        while (s<=e){
            int m=s+(e-s)/2;
            if(arr[m]<target){
                s=m+1;
            }else if(arr[m]>target){
                e=m-1;
            }else {
                ans=m;
                if(isFirst){
                    e=m-1;
                }else{
                    s=m+1;
                }
            }
        }

        return ans;
    }
}
