package com.dsAlgo.array;

import com.dsAlgo.practise.search;

import java.util.Arrays;
import java.util.Scanner;

public class basicArray {
    public static void main(String[] args) {
//        Scanner sc = new Scanner(System.in);
//        int n= sc.nextInt();
        int[] arr = new int[]{1,2,3,4,5,6,7,8,9,10};
//        for (int i = 0; i < n; i++) {
//            arr[i] = sc.nextInt();
//        }
//        System.out.println("\n");
//        for (int i:arr) {
//            System.out.print(i+ "  ");
//
//        }
        int[] arr2= new int[arr.length];
        System.arraycopy(arr,0,arr2,0,arr.length);
        System.out.println(Arrays.toString(arr2));
//        System.out.println("\n");
//        System.out.println(Arrays.toString(arr));
//        System.out.println("Enter element to be searched: ");
//        int target=sc.nextInt();
//        System.out.println("index of element is "+ search.binarySearch(arr,target) );
//        sc.close();
    }
}
