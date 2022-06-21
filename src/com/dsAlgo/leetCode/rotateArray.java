
//https://leetcode.com/problems/rotate-array/

package com.dsAlgo.leetCode;

import java.util.ArrayList;

public class rotateArray {
    public static void main(String[] args) {

    }
    public void rotateArray(int[] nums, int k) {
        ArrayList<Integer> arr = new ArrayList<>();
        for (int num : nums) {
            arr.add(num);
        }
        for(int i=0;i<=k;i++){
            arr.add(0,arr.remove(nums.length-1));
        }
        for(int i=0;i<nums.length;i++){
            nums[i]= arr.get(i);
        }
    }
    public void rotate(int[] nums, int k) {
        for(int j=0;j<k;j++){
            int temp=nums[nums.length-1];
            for(int i=nums.length-1;i>0;i--){
                nums[i]=nums[i-1];
            }
            nums[0]=temp;
        }
    }

    public static void rotateSwap(int[] n,int k){
        for(int i=0;i<k;i++){
            n[i]+=n[k+i];
            n[k+i]=n[i]-n[k-i];
            n[i]=n[i]-n[k-i];
        }
    }
}
