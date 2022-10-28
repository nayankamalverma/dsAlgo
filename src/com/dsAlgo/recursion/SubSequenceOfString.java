package com.dsAlgo.recursion;

import java.util.ArrayList;
import java.util.Scanner;

public class SubSequenceOfString {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str = sc.next();
        System.out.println(subSeq(str));
        sc.close();
    }

    private static ArrayList<String> subSeq(String str){
        if(str.length()==0){
        ArrayList<String> result= new ArrayList<>();
            result.add("");
            return result;
        }
        char ch= str.charAt(0);
        ArrayList<String> result= new ArrayList<>();
        ArrayList<String> subSeq = subSeq(str.substring(1));
        for(int i=0;i<subSeq.size();i++){
            result.add(subSeq.get(i));
            result.add(ch + subSeq.get(i));
        }
        return result;
    }
}
