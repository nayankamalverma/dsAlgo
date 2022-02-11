
//https://leetcode.com/problems/rotate-array/

package com.dsAlgo.leetCode;

import java.util.ArrayList;

public class rotateArray {
    public static void main(String[] args) {

    }
    public void rotate(int[] nums, int k) {
        ArrayList arr = new ArrayList<>();
        for(int i=0;i<nums.length;i++){
            arr.add(nums[i]);
        }
        for(int i=0;i<=k;i++){
            arr.add(0,arr.remove(nums.length-1));
        }
        for(int i=0;i<nums.length;i++){
            nums[i]= (int) arr.get(i);
        }
    }
}
