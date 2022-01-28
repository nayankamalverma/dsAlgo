
//https://leetcode.com/problems/maximum-product-difference-between-two-pairs/

package com.dsAlgo.leetCode;

import java.util.Arrays;

public class maximumProductDifferenceBetweenTwoPairs {
    public int maxProductDifference(int[] n) {
        Arrays.sort(n);
        return ((n[n.length-1]*n[n.length-2])-(n[0]*n[1]));
    }
}
