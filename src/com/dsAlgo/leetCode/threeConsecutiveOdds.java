package com.dsAlgo.leetCode;

public class threeConsecutiveOdds {
    public boolean threeConsecutiveOdds(int[] arr) {
        for(int i=0;i<arr.length-2;i++){
            if(arr.length<3)
                return false;
            else if(arr[i]%2!=0 && arr[i+1]%2!=0 && arr[i+2]%2!=0){
                return true;
            }
        }
        return false;
    }
}
