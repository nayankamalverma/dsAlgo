package com.dsAlgo.leetCode.bitManipulation;

public class SingleNumber2 {
    public static void main(String[] args) {
        int[] arr={0,0,1,0,1,2,2,2,99,1};
        System.out.println(singleNumber(arr));
    }
    public static int singleNumber(int[] nums) {
        int[] bitCnt=new int[32];
        for(int i=0;i<32;i++){
            for(int n: nums){
                if((n&1<<i)!= 0){
                    bitCnt[i]++;
                }
            }
        }
        int n=0;
        for(int i=31;i>=0;i--){
            if(bitCnt[i]%3!=0){
                n|=1<<i;
            }
        }
        return n;
    }
}
