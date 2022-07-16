package com.dsAlgo.leetCode.String;

//https://leetcode.com/problems/shuffle-string/

public class ShuffleString {
    public static void main(String[] args) {
        String str ="codeleet" ;
        int[] index ={4,5,6,7,0,2,1,3};
        System.out.println(restoreString(str,index));
    }

    public static String restoreString(String s, int[] indices) {
        StringBuilder sb=new StringBuilder(s);
        for(int i=0;i<s.length();i++){
            sb.setCharAt(indices[i],s.charAt(i));
        }
        return sb.toString();
    }
}
