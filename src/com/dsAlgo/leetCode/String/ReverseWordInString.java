package com.dsAlgo.leetCode.String;

public class ReverseWordInString {
    public static void main(String[] args) {
        System.out.println(reverseWords("a good   example"));
    }
    public static String reverseWords(String s) {
        String[] str=s.split(" ");
        StringBuilder ans= new StringBuilder();
        for(int i=str.length-1;i>0;i--){
            if(str[i].length()==0)continue;
            ans.append(str[i]).append(" ");
        }
        ans.append(str[0]);
        return ans.toString().trim();
    }
}
