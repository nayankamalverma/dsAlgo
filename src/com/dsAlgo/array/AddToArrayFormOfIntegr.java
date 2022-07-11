package com.dsAlgo.array;

//https://leetcode.com/problems/add-to-array-form-of-integer/

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class AddToArrayFormOfIntegr {

    public static void main(String[] args) {
            int[] arr={1,2,2,0,2};
            int k=9999;
        System.out.println(Arrays.toString(new List[]{addToArrayForm(arr, k)}));
    }
    public static List<Integer> addToArrayForm(int[] num, int k) {
        List<Integer> ans= new ArrayList<>();
        for(int i=num.length-1;i>=0;i--){
            ans.add(0,(num[i]+k)%10);
            k=(num[i]+k)/10;
        }
        while(k>0){
            ans.add(0,k%10);
            k/=10;
        }
        return ans;
    }
}
