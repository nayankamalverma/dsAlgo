package com.dsAlgo.recursion;

import java.util.ArrayList;
import java.util.Scanner;

public class findTargetArr {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        System.out.println("Enter no. of elements");
        int x = sc.nextInt();
        int[] arr= new int[x];
        for (int i = 0; i <x ; i++) {
            arr[i]= sc.nextInt();
        }
        int target = sc.nextInt();
//        System.out.println(indexOfTarget(arr,target,0, new ArrayList<>()));
        System.out.println(targetIndex(arr,target,0));
    }



    private static ArrayList<Integer> indexOfTarget(int[] arr,int target,int i,ArrayList<Integer> ans){
        if(i==arr.length)return ans;
        if(target==arr[i])ans.add(i);
        indexOfTarget(arr, target, i+1, ans);
        return ans;
    }

    private static ArrayList<Integer> targetIndex(int[] arr,int target,int i){
        if(i== arr.length)return new ArrayList<>();
        ArrayList<Integer> subArr= targetIndex(arr, target, i+1);
        if(arr[i]==target)subArr.add(0,i);
        return subArr;
    }
}
