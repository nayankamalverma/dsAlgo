package com.dsAlgo.leetCode;
import java.util.Arrays;;

public class MoveZeros {
    public static void main(String[] args) {
        int[] arr={0,1,0,3,12};
        moveZeros(arr);
        System.out.println(Arrays.toString(arr));
    }
    static void moveZeros(int[] nums){
        int k=0;
        int l=nums.length-1;
        for(int i=0;i<nums.length;i++){
            if(nums[i]!=0){
                nums[k]=nums[i];
                k++;
                if(i!=0 && i<l){
                    nums[i]=0;
                    nums[l]=0;
                    l--;
                }
            }
        }
    }
}
