package com.dsAlgo.hackerRank;

import java.util.Scanner;

public class intToString {
    public static void main(String[] args) {
        try {
            Scanner sc = new Scanner(System.in);
            int n = sc.nextInt();
            String s = Integer.toString(n);
            if (n == Integer.parseInt(s) ) {
                System.out.println("Good job");
            }else {
                System.out.println("Wrong answer");
            }
        }catch (Exception e){
            System.out.println(e);
        }
    }
}

