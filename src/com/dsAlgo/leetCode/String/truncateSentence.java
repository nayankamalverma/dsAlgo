package com.dsAlgo.leetCode.String;

public class truncateSentence {
    public static void main(String[] args) {
        String s= "Hello 87 776 send find";
        int k=4;
        System.out.println(truncateSentences(s,k));
    }

    private static String truncateSentences(String s, int k) {
        String[] str= s.split(" ");
        StringBuilder ans= new StringBuilder();
        for(int i=0;i<k;i++){
            ans.append(str[i]);
            if(i==k-1)
                break;
            ans.append(" ");
        }
        return ans.toString();
    }
}
