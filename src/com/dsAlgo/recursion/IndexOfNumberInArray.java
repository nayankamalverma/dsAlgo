package com.dsAlgo.recursion;

import java.util.Scanner;

public class IndexOfNumberInArray {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n= sc.nextInt();
        int[] arr = new int[n];
        for (int i = 0; i <n ; i++) {
            arr[i]=sc.nextInt();
        }
        int x= sc.nextInt();
        System.out.println(countOccurrence(arr,0,x,0));
    }

    private static int countOccurrence(int[] arr, int i,int num,int cnt) {
        if(i== arr.length)return cnt;
        else if (arr[i]==num) {
            return countOccurrence(arr, i+1, num, cnt+1);
        }else return countOccurrence(arr, i+1, num, cnt);
    }

    private static int findLastIndex(int[] arr, int i, int num) {
        if(i== arr.length)return -1;
        int index = findLastIndex(arr,i+1,num);
        if(index==-1){
             if(arr[i]==num)return i;
             else return -1;
        }
        return index;
    }

}
