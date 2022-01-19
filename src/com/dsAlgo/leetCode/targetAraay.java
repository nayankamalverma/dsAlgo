package com.dsAlgo.leetCode;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

public class targetAraay {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int arr[] , n ,index[];
        n=sc.nextInt();
        arr = new int[n];
        index=new int[arr.length];
        for (int i = 0; i < n; i++) {
            arr[i]=sc.nextInt();
        }
        for (int i = 0; i < n; i++) {
            index[i]= sc.nextInt();
        }
        ArrayList<Integer> tar = new ArrayList<>();
        for (int i = 0; i < n; i++) {
            tar.add(index[i],arr[i]);
        }
        System.out.println(tar);
        tar.clear();
        System.out.println();
        System.out.println(Arrays.toString(target(arr,index)));
    }

    static int[] target(int[] nums, int[] index) {
        int[] target = new int[nums.length];
        int i = 0, k = 0;
        while (i < index.length) {
            for (k = target.length - 1; k > index[i]; k--)
                target[k] = target[k - 1];
            target[index[i]] = nums[i];
            i++;
        }
        return target;

//        or

//        int[] res = new int[nums.length];
//
//        for(int i = 0; i < nums.length; i++)
//        {
//            int idx = index[i];
//
//            if(idx < i)
//            {
//                for(int j = i; j > idx; j--)
//                    res[j] = res[j-1];
//            }
//
//            res[idx] = nums[i];
//        }
//
//        return res;
    }
}
