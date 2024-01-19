package com.dsAlgo.practise;

import java.util.Arrays;
import java.util.Scanner;

public class search {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n= sc.nextInt();
        int[] arr = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }
        Arrays.sort(arr);
        System.out.println("Enter element to be searched: ");
        int target=sc.nextInt();
        System.out.println("index of element is "+ binarySearch(arr,target) );
    }

    public static int binarySearch(int[] arr,int target){
        if(arr.length==1 && arr[0]==target)
            return 0;
        int s=0,e=arr.length-1;
        while(s<=e){
            int m = s + (e-s)/2;
            if(arr[m]==target){
                return m;
            }else if(arr[m]>target){
                e=m-1;
            }else{
                s = m+1;
            }
        }
        return -1;
    }

    public static int orderAgnosticBinarySearch(int[] arr,int target){
        int start=0,end= arr.length-1;
        boolean isAsc = arr[0] < arr[arr.length-1];
        while (start<=end){
            int mid = start+ (end-start)/2;
            if(target==arr[mid]) {
                return mid;
            }
            if(isAsc){
                if(target<arr[mid]) {
                    end = mid - 1;
                }else{//else if (target>arr[mid]){
                    start = mid+1;
                }
            }
            else {
                if(target>arr[mid]) {
                    end = mid - 1;
                 }else{//else if (target<arr[mid]){
                    start = mid+1;
                }
            }
        }
        return -1;
    }
}
