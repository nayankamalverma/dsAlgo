package com.dsAlgo.practise.string;

import java.util.Scanner;

public class pract1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s1 = sc.next();
        String s2 = sc.next();
        String s3 = sc.next();
        String s4 = sc.next();

        System.out.println(finalLength(s1,s2,s3,s4));
        sc.close();

    }

    static int finalLength(String str,String s1, String s2,String s3){
        StringBuilder sb = new StringBuilder();
        sb.append(str);
            if(sb.indexOf(s1)!=-1){
                sb.replace(sb.indexOf(s1), sb.indexOf(s1)+s1.length(), "");
                System.out.println(sb+ " "+ sb.length());
            }
            if(sb.indexOf(s2)!=-1){
                sb.replace(sb.indexOf(s2), sb.indexOf(s2)+s2.length(), "");
                System.out.println(sb+ " "+ sb.length());
            }
            if(sb.indexOf(s3)!=-1){
                sb.replace(sb.indexOf(s3), sb.indexOf(s3)+s3.length(), "");
                System.out.println(sb+ " "+ sb.length());
            }
            return sb.length();        
    }
}
