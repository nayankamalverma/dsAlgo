package com.dsAlgo.leetCode.String;

import java.util.Scanner;

public class StringCompression {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str= sc.next();
        System.out.println(compress(str.toCharArray()));
    }
    public static int compress(char[] chars) {
        StringBuilder s = new StringBuilder();
        int l=chars.length;
        for(int i=0;i<l; ){
            char c = chars[i];
            s.append(c);
            int cnt=1;
            i++;
            while(i<l && chars[i]==c){
                cnt++;
                i++;
            }
            if(cnt!=1){
                for(char cc: Integer.toString(cnt).toCharArray()){
                    s.append(cc);
                }
            }
        } System.out.println(s);
        return s.length();
    }
}
