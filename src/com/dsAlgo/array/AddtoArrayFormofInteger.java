
//989. Add to Array-Form of Integer
//        https://leetcode.com/problems/add-to-array-form-of-integer/

package com.dsAlgo.array;

import java.util.ArrayList;
import java.util.Scanner;

public class AddtoArrayFormofInteger {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n= sc.nextInt();
        int[] arr = new int[n];
        for (int i=0;i<n;i++){
            arr[i]= sc.nextInt();
        }
        int k= sc.nextInt();
        System.out.println(addToArrayForm(arr,k));
    }

    public static ArrayList<Integer> addToArrayForm(int[] num, int k) {
        ArrayList<Integer> ans= new ArrayList<>();
        long n=0;
        for(int i:num){
            n = (n*10)+i;
        }
        n+=k;
        while(n>0){
            int a =(int)n%10;
            ans.add(0,a);
            n/=10;
        }
        return ans;
    }
}
