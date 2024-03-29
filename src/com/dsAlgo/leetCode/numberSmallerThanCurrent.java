/*
    How Many Numbers Are Smaller Than the Current Number

    Given the array nums, for each nums[i] find out how many numbers in the array are smaller than it. That is, for each nums[i] you have to count the number of valid j's such that j != i and nums[j] < nums[i].

Return the answer in an array.



Example 1:

Input: nums = [8,1,2,2,3]
Output: [4,0,1,1,3]
Explanation:
For nums[0]=8 there exist four smaller numbers than it (1, 2, 2 and 3).
For nums[1]=1 does not exist any smaller number than it.
For nums[2]=2 there exist one smaller number than it (1).
For nums[3]=2 there exist one smaller number than it (1).
For nums[4]=3 there exist three smaller numbers than it (1, 2 and 2).
*/


package com.dsAlgo.leetCode;

import java.util.Arrays;
import java.util.Scanner;

public class numberSmallerThanCurrent {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt(),cnt=0;
        int[] arr = new int[n],ans =new  int[arr.length];
        for (int i = 0; i < arr.length; i++) {
            arr[i] = sc.nextInt();
        }
        for(int i=0;i<arr.length;i++){
            cnt=0;
            for(int j=0; j<arr.length;j++)
            {

                if(i==j)
                    continue;
                else if(arr[j]<arr[i]){
                    cnt++;
                }
            }
            ans[i]=cnt;
        }
        System.out.println(Arrays.toString(ans));
        sc.close();
    }
}
