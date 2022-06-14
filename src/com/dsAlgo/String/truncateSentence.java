package com.dsAlgo.String;

import java.util.ArrayList;

public class truncateSentence {
    public static void main(String[] args) {
        String s= "Hello how are you dsgfd fgfdg";
        int k=4;
        System.out.println(truncateSentences(s,k));
    }

    private static String truncateSentences(String s, int k) {
        String[] str= s.split(" ");
        String ans="";
        for(int i=0;i<k;i++){
            ans += str[i];
            if(i==k-1)
                break;
            ans+=" ";
        }
        return ans;
    }
}
