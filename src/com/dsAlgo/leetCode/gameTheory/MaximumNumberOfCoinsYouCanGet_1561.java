package com.dsAlgo.leetCode.gameTheory;

import java.util.Arrays;

public class MaximumNumberOfCoinsYouCanGet_1561 {

    static int maxCoins(int[] piles) {
        int n=piles.length;
        Arrays.sort(piles);
        int coins=0;
        for(int i=0;i<n/3;i++){
            coins+=piles[n-(2*i)-2];
        }
        return coins;
    }
}
