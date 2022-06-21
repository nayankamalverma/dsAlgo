
//https://leetcode.com/problems/remove-duplicates-from-sorted-array/

package com.dsAlgo.leetCode;

import java.util.Arrays;
import java.util.Scanner;

public class RemoveDuplictes {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n= sc.nextInt();
        int[] arr = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }
        System.out.println(removeDuplicates(arr));
        System.out.println(Arrays.toString(arr));
    }
    public static int removeDuplicates(int[] nums) {
        int cnt =0,n=nums.length;
        int k=0;
        for(int i=0;i<nums.length;i++){

            int a=nums[i];
            nums[k]=nums[i];
            cnt++;
            i++;
            k++;
            while(i<=n-1 && a==nums[i]){
                i++;
            }
            i--;
        }
        return cnt;
    }
}
