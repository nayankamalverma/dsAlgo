package com.dsAlgo.gfg;

import java.util.ArrayList;
import java.util.Arrays;

public class FindDuplicate {
    public static void main(String[] args) {
        int[] arr ={2,1,3,2,3};
        int n=5;

        System.out.println(duplicates(arr,n));
    }

    public static ArrayList<Integer> duplicates(int[] arr, int n) {
        ArrayList<Integer> ans= new ArrayList<>();
        Arrays.sort(arr);
        for(int i=0;i<arr.length; ){
            int a=arr[i];
            i++;
            if(i<arr.length && a==arr[i]){
                ans.add(a);
            }
            i++;
            while(i<arr.length && arr[i]==a){
                i++;
            }
        }
        if(ans.size()==0){
            ans.add(-1);
        }
        return ans;
    }
}
