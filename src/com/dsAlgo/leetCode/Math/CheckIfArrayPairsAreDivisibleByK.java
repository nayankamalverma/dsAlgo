package com.dsAlgo.leetCode.Math;
//leetcode 1497
public class CheckIfArrayPairsAreDivisibleByK {
    public static void main(String[] args) {
        int[] arr={1,-2,3,4,5,0,6,7,-8,9};
        System.out.println(canArrange(arr,3));
    }
    public static  boolean canArrange(int[] arr, int k) {
        // if(k%2==0)return false;
        int[] mod= new int[arr.length];
        for(int i=0;i<arr.length;i++){
            System.out.println(arr[i]%k);
            int m=arr[i]%k;
            if(m<0)m+=k;
            System.out.println(m);
            mod[i]=m;
        }
        int[] freq= new int[k];
        for(int i:mod){
            freq[i]++;
        }
        if(freq[0]%2 != 0) return false;

        for(int i = 1; i <= k/2; i++)
            if(freq[i] != freq[k-i]) return false;

        return true;
    }
}
