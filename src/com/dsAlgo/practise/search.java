package com.dsAlgo.practise;

import java.util.Scanner;

public class search {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n= sc.nextInt();
        int[] arr = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }
        System.out.println("Enter element to be searched: ");
        int target=sc.nextInt();
        System.out.println("index of element is "+ search.binarySearch(arr,target) );
    }

    public static int binarySearch(int[] arr,int target){
        int start=0,end= arr.length-1;
        while (start<=end){
            int mid = start+ (end-start)/2;
            if(target<arr[mid]) {
                end = mid - 1;
            }else if (target>arr[mid]){
                start = mid+1;
            }else {
                //ans found
                return mid;
            }
        }
        return -1;
    }
}
