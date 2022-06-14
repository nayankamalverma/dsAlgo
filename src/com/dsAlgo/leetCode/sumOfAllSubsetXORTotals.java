package com.dsAlgo.leetCode;

public class sumOfAllSubsetXORTotals {
        public static void main(String[] args) {
                int[] arr={3,4,5,6,7,8};
                System.out.println(subsetXORSum(arr));
        }
        public static int subsetXORSum(int[] nums) {
                int sum=0,xor=0;
                for(int i=0;i<nums.length;i++){
                        sum+=nums[i];
                        for(int j=i+1;j<nums.length;j++){
                                sum+=nums[i]^nums[j];
                        }
                        if(nums.length!=2){
                                xor=xor^nums[i];
                        }
                }
                sum+=xor;
                return sum;
        }
}

