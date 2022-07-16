package com.dsAlgo.codingBlock;

import java.util.Scanner;

public class MaxFrequencyCharacter {

    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        String str = sc.next();
        System.out.println(maxFreq(str));
        sc.close();
    }

    private static char maxFreq(String str) {
        int[] freq= new int[26];
        int max=0;
        for (int i = 0; i < str.length(); i++) {
            freq[str.charAt(i)-97]++;
        }
        for (int i = 1; i <26 ; i++) {
            if(freq[i]>freq[max]){
                max=i;
            }
        }
        return (char) (max+97);
    }
}
