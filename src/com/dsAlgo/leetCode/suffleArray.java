//    Given the array nums consisting of 2n elements in the form [x1,x2,...,xn,y1,y2,...,yn].
//
//        Return the array in the form [x1,y1,x2,y2,...,xn,yn].
//
//
//
//        Example 1:
//
//        Input: nums = [2,5,1,3,4,7], n = 3
//        Output: [2,3,5,4,1,7]
//        Explanation: Since x1=2, x2=5, x3=1, y1=3, y2=4, y3=7 then the answer is [2,3,5,4,1,7].

// Leet code
package com.dsAlgo.leetCode;

import java.util.Arrays;
import java.util.Scanner;

public class suffleArray {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[2*n];
        int[] ans = new int[arr.length];
        for (int i = 0; i < arr.length; i++) {
            arr[i] = sc.nextInt();
        }
        for (int i = 0, j = n, k = 0; k < arr.length; i++, j++) {
            ans[k++] = arr[i];
            ans[k++] = arr[j];
        }
        System.out.println(Arrays.toString(ans));
        sc.close();
    }

}
