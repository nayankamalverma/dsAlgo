package com.dsAlgo.hackerRank;

import java.util.Scanner;

public class dataType {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter number of element: ");
        int n = sc.nextInt();
        for (int i = 0; i < n; i++) {
            try{
                long x = sc.nextLong();
                System.out.println(x+" can be fitted in:");
                if(x>=-127 && x<=127){
                    System.out.println("* byte");
                }
                if(x>= Short.MIN_VALUE && x<= Short.MAX_VALUE){
                    System.out.println("* short");
                }
                if(x>= Integer.MIN_VALUE && x<= Integer.MAX_VALUE){
                    System.out.println("* int");
                }
                if(x>=Long.MIN_VALUE && x<=Long.MAX_VALUE)
                    System.out.println("* long");

            }catch (Exception e){
                System.out.println(sc.next()+" can't be fitted anywhere.");
            }
        }
    }
}
