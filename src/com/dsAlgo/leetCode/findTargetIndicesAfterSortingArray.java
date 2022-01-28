package com.dsAlgo.leetCode;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class findTargetIndicesAfterSortingArray {
    public List<Integer> targetIndices(int[] nums, int target) {
        ArrayList<Integer> res= new ArrayList<>();
        Arrays.sort(nums);
        for(int i=0;i<nums.length;i++){
            if(nums[i]==target){
                res.add(i);
                if(i==nums.length-1||nums[i+1]!=target){
                    break;
                }
            }
        }
        return res;
    }
}
