package com.dsAlgo.String;

import java.util.Scanner;

public class basicString {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.next();
        System.out.println(interpret(s));
    }

    static String interpret(String str) {
        String s = "";
        for (int i = 0; i < str.length(); i++) {
            if(str.charAt(i)=='G'){
                s+="G";
            }else if(str.charAt(i)=='(' && str.charAt(i+1)==')'){
                s+="o";
                i++;
            }else if(str.charAt(i)=='(' && str.charAt(i+1)=='a'){
                s+="al";
                i+=3;
            }
        }
        return s;
    }
}
