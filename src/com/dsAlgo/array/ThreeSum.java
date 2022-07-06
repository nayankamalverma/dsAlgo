package com.dsAlgo.array;

import java.util.ArrayList;
import java.util.List;

public class ThreeSum {
    public static void main(String[] args) {
        int[] arr= new int[]{-1,0,1,2,-1,-4};
    }
    public static List<List<Integer>> threeSum(int[] nums) {
        int n=nums.length;
        int x=0;
        List<List<Integer>> arr= new ArrayList<>();
        for(int i=0;i<n;i++){
            for(int j=i+1;j<n;j++){
                for(int k=j+1;k<n;k++){
                    if(nums[i]+nums[j]+nums[k]==0){
                        arr.add(new ArrayList<>());
                        arr.get(x).add(nums[i]);
                        arr.get(x).add(nums[j]);
                        arr.get(x).add(nums[k]);
                        x++;
                    }
                }
            }
        }
        return arr;
    }
}
