package com.dsAlgo.leetCode.String;

import java.util.ArrayList;
import java.util.Scanner;

public class SubSequence {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str = sc.next();
        System.out.println(getSS(str));
    }

    private static ArrayList<String> getSS(String str) {
        if (str.length()==0){
            ArrayList<String> temp= new ArrayList<>();
            temp.add("");
            return temp;
        }
        char c = str.charAt(0);
        String subStr= str.substring(1);
        ArrayList<String> ans = new ArrayList<>();
        ArrayList<String> recAns = getSS(subStr);
        for (String recAn : recAns) {
            ans.add(recAn);
            ans.add(c + recAn);
        }
        return ans;
    }
}
