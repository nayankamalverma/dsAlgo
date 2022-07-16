package com.dsAlgo.recursion;

import java.util.Arrays;

public class ReverseString {
    public static void main(String[] args) {
        String str ="pinger";
        char[] s=str.toCharArray();
        reverseString(s);
        System.out.println(Arrays.toString(s));
    }
    public static void reverseString(char[] s) {
        int rightIndex=s.length-1,leftIndex=0;
        rev(leftIndex,rightIndex,s);

    }
    public static void rev(int l,int r,char[] s){
        if(l>=s.length/2){
            return;
        }

        char temp = s[l];
        s[l]=s[r];
        s[r]=temp;

        rev(l+1,r-1,s);
    }
}
