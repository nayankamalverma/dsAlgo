package com.dsAlgo.leetCode;

import java.util.Arrays;
import java.util.Scanner;

public class platesBetweenCandels {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter string: ");
        String s = sc.next();
        System.out.println("Enter number of queries: ");
        int n =sc.nextInt();
        int[][] arr= new int[n][2];
        for(int[] i: arr){
            i[0]=sc.nextInt();
            i[1]=sc.nextInt();
        }
        int ans[];
        ans = platesAndCandles(s,arr);
        System.out.println(Arrays.toString(ans));
    }

    public static int[] platesAndCandles(String s, int[][] queries) {
        int[] ans=new int[queries.length];
        for(int i=0;i<queries.length;i++){
            ans[i]=plateCount(s,queries[i][0],queries[i][1]);
        }
        return ans;
    }
    public static int plateCount(String s,int l,int r){
        int cnt=0;
        for(int i=l+1;i<r;i++){
            if(s.charAt(i)=='*') {
                cnt++;
            }
        }
        return cnt;
    }
}
