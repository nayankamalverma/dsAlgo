package com.dsAlgo.codingBlock;

import java.util.Scanner;

public class StringCompression {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s= sc.next();
        System.out.println(stringCompression(s));
    }

    private static String stringCompression(String s) {
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i <s.length() ; i++) {
            char x=s.charAt(i);
            int cnt=1;
            while(++i<s.length() && s.charAt(i)==x){
                cnt++;
            }
            i--;
            sb.append(x);
            if(cnt>1){
                sb.append(cnt);
            }
        }
        return sb.toString();
    }
}