
//https://leetcode.com/problems/count-good-triplets

package com.dsAlgo.leetCode;

public class countGoodTriplets {
    public int countTriplets(int[] arr, int a, int b, int c) {
        int cnt=0;
        for(int i=0;i<arr.length;i++){
            for(int j=i+1;j<arr.length;j++){
                for(int k=j+1;k<arr.length;k++){
                    if(Math.abs(arr[i]-arr[j])<=a){
                        if(Math.abs(arr[j]-arr[k])<=b){
                            if(Math.abs(arr[i]-arr[k])<=c){
                                cnt++;
                            }
                        }
                    }
                }
            }
        }
        return cnt;
    }
}
