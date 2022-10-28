package com.dsAlgo.gfg;

import java.util.ArrayList;

public class ReverseArrayInGroup {

    public static void main(String[] args) {

    }

    private static void reverseInGroups(ArrayList<Integer> arr, int n, int k) {
        reverse(arr,0,k-1);
        reverse(arr,k,n-1);
    }
    public static void reverse(ArrayList<Integer> arr, int start, int end){
        while(start < end) {
            int temp = arr.get(start);
            arr.set(start, arr.get(end));
            arr.set(end, temp);
            start++; end--;
        }
    }

}
