
//https://leetcode.com/problems/keep-multiplying-found-values-by-two/submissions/

package com.dsAlgo.leetCode;


import java.util.Arrays;

public class keepMultiplyingFoundValuesbyTwo {
    public static void main(String[] args) {
        int[] arr={5,3,6,1,12};
        int k=3;
        System.out.println(findFinalValue(arr,k));
    }
    public static int findFinalValue(int[] nums, int original) {
        Arrays.sort(nums);
        int ans=original;
        while(true){

            int i = binarySearch(nums,ans);
            if(i==-1){
                break;
            }
            ans=nums[i]*2;
        }
        return ans;
    }

    public static int binarySearch(int[] arr,int target){
        int s=0,e=arr.length-1;
        while(s<=e){
            int m=s+(e-s)/2;
            if(target==arr[m]){
                return m;
            }else if(target<arr[m]){
                e=m-1;
            }else{
                s=m+1;
            }
        }
        return -1;
    }
}
