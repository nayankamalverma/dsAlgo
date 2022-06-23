
//1995:  https://leetcode.com/problems/count-special-quadruplets/

package com.dsAlgo.array;

import java.util.Scanner;

public class CountSpecialQuadruplets {
    public static void main(String[] args) {
//        Scanner sc = new Scanner(System.in);
//        int n= sc.nextInt();
        int[] arr = new int[]{28,8,49,85,37,90,20,8};
//        for (int i = 0; i < arr.length; i++) {
//            arr[i] = sc.nextInt();
//        }
        System.out.println(countQuadruplets(arr));
    }

    public static int countQuadruplets(int[] arr) {
        int cnt=0;
        for(int i=0;i<arr.length;i++){
            for(int j=i+1;j<arr.length;j++){
                for(int k=j+1;k<arr.length;k++){
                    for(int l=k+1;l<arr.length;l++){
                        if(arr[i]+arr[j]+arr[k]==arr[l])
                            cnt++;
                    }
                }
            }
        }
        return cnt;
    }
}
