package com.dsAlgo.hackerRank;

import java.util.ArrayList;
import java.util.Scanner;

public class PlusMinus {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n= sc.nextInt();
        ArrayList<Integer> arr = new ArrayList<>();
        for (int i = 0; i < n; i++) {
            arr.add(sc.nextInt());
        }
        plusMinus(arr);
    }

    private static void plusMinus(ArrayList<Integer> arr) {
        int pos=0,nev=0,z=0,n=arr.size();
        for(int i:arr){
            if(i<0){
                nev++;
            }else if(i>0){
                pos++;
            }else{z++;}
        }
        System.out.printf("%6f%n",(double) pos/(double) n);
        System.out.printf("%6f%n",(double) nev/(double) n);
        System.out.printf("%6f",(double) z/(double) n);
    }
}
