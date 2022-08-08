package com.dsAlgo.array;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class arrayList {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        ArrayList<Integer> arr = new ArrayList<>();
        int n=sc.nextInt();
        for (int i = 0; i < n; i++) {
            arr.add(sc.nextInt());
        }
        Collections.reverse(arr);
        System.out.println(arr);
        System.out.println(!arr.contains(4));
        int x=arr.remove(3);
        arr.add(0,x);
        Collections.sort(arr);
        System.out.println(arr);
        sc.close();
    }

    public static void rotateArray(int[] arr,int k){

    }
}
