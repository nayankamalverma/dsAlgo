
//https://leetcode.com/problems/rotate-array/

package com.dsAlgo.leetCode;

import java.util.ArrayList;
import java.util.Arrays;

public class rotateArray {
    public static void main(String[] args) {
        int[] arr=new int[]{1,2,3,4,5,6,7};
        int k=2;
        rotate(arr,k);
        System.out.println(Arrays.toString(arr));
    }

        public static void rotate(int[] nums,int k){
            int n=nums.length;
            k%=n;
            System.out.println(k);
            reverse(nums,0,n);
            reverse(nums,0,k);
            reverse(nums,k,n);
        }

    public static void reverse(int[] arr,int s,int e){
        for(int j=e-1;s<j;s++,j--){
            int temp=arr[s];
            arr[s]=arr[j];
            arr[j]=temp;
        }
    }
//    public void rotateArray(int[] nums, int k) {
//        ArrayList<Integer> arr = new ArrayList<>();
//        for (int num : nums) {
//            arr.add(num);
//        }
//        for(int i=0;i<=k;i++){
//            arr.add(0,arr.remove(nums.length-1));
//        }
//        for(int i=0;i<nums.length;i++){
//            nums[i]= arr.get(i);
//        }
//    }
//    public void rotate(int[] nums, int k) {
//        for(int j=0;j<k;j++){
//            int temp=nums[nums.length-1];
//            for(int i=nums.length-1;i>0;i--){
//                nums[i]=nums[i-1];
//            }
//            nums[0]=temp;
//        }
//    }
//
//    public static void rotateSwap(int[] n,int k){
//        for(int i=0;i<k;i++){
//            n[i]+=n[k+i];
//            n[k+i]=n[i]-n[k-i];
//            n[i]=n[i]-n[k-i];
//        }
//    }
}
