package com.dsAlgo.array;

import java.util.ArrayList;
import java.util.Scanner;

public class ReverseArrLIst {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        ArrayList<Integer> arr= new ArrayList<>();
        int n = sc.nextInt();
        while (n>0) {
            arr.add(sc.nextInt());
            n--;
        }
        int k= sc.nextInt();
//        reverseArr(arr);
        System.out.println(arr);
        leftRotateArr(arr,k);
        System.out.println(arr);
    }

    private static void leftRotateArr(ArrayList<Integer> arr, int k) {
        while (k>0){
            arr.add(arr.remove(0));
            k--;
        }
    }

    private static void reverseArr(ArrayList<Integer> arr) {
        for (int i = arr.size()-1; i>=0 ; i--) {
            arr.add(arr.remove(i));
        }
    }

}
