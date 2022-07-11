package com.dsAlgo.array;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class MajorityElement2 {
    public static void main(String[] args) {
        int[] arr={3,2,2,2,3};
        System.out.println(majorityElement(arr));
    }
    public static List<Integer> majorityElement(int[] nums) {
        int major=nums.length/3;
        List<Integer> ans = new ArrayList<>();
        for(int n:nums){
            int cnt=0;
            for(int i:nums){
                if(i==n)
                    cnt++;
            }
            if(cnt>major && !ans.contains(n))
                ans.add(n);
        }
        return ans;
    }

    public static boolean search(List<Integer> arr,int target){
        Collections.sort(arr);
        if(arr.size()==0)
            return false;
        int s=0,e=arr.size()-1;
        while(s<=e){
            int m=s+(e-s)/2;
            int value=arr.get(m);
            if(value==target){
                return true;
            }else if(value<target){
                s=m+1;
            }else{
                e=m-1;
            }
        }
        return false;
    }
}
