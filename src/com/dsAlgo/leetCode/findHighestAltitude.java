/*

        1732. Find the Highest Altitude

* There is a biker going on a road trip. The road trip consists of n + 1 points at different altitudes. The biker starts his trip on point 0 with altitude equal 0.

You are given an integer array gain of length n where gain[i] is the net gain in altitude between points i​​​​​​ and i + 1 for all (0 <= i < n). Return the highest altitude of a point.



Example 1:

Input: gain = [-5,1,5,0,-7]
Output: 1
Explanation: The altitudes are [0,-5,-4,1,1,-6]. The highest is 1.
*
*
*
*
*
* */


package com.dsAlgo.leetCode;

import java.util.Scanner;

public class findHighestAltitude {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n=sc.nextInt();
        int[] arr= new int[n];
        for (int i = 0; i < n; i++) {
            arr[i]=sc.nextInt();
        }
        System.out.println(highestAltitude(arr));
        sc.close();
    }

    static int highestAltitude(int[] arr) {
        int max=0,ans=0;
        for (int i: arr) {
            ans +=i;
            max = Integer.max(max,ans);
        }
        return max;
    }
}
