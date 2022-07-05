
//https://leetcode.com/problems/split-array-largest-sum/

//https://youtu.be/W9QJ8HaRvJQ?t=14274

package com.dsAlgo.leetCode.binarySearch;

public class SplitArrayLargestSum {
    public static void main(String[] args) {
        int[] arr= new int[]{7,2,5,10,8};
        int subDivs=4;
        System.out.println(splitArray(arr,subDivs));
    }
    public static int splitArray(int[] nums, int m) {
        int s=0,e=0;
        for(int n: nums){
//      case: 2 => max no of partition whe subDivs == arr.length;
//            in this case the ans will be the max number in the array;
            s = Math.max(s,n);
//        case 2: min no. of Partition when subDivs=1
//           in this case  ans will be sum of all num in arr;
            e += n;
        }
        while(s<e){
            int mid=s+(e-s)/2;
            int sum=0;
            int subDiv=1;
            for(int n:nums){
                if(sum+n>mid){
                    sum=n;
                    subDiv++;
                }else{
                    sum+=n;
                }
            }
            if(subDiv>m){
                s=mid+1;
            }else{
                e=mid;
            }
        }
        return s;
    }
}
