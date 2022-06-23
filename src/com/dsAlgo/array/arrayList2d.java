package com.dsAlgo.array;

import java.util.ArrayList;
import java.util.Scanner;

public class arrayList2d {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        ArrayList<ArrayList<Integer>> list = new ArrayList<>();
        System.out.println("Enter no. of rows: ");
        int r= sc.nextInt(),c;
        for (int i = 0; i < r; i++) {

        }
        for (int i = 0; i < r; i++) {
             c= sc.nextInt();
            for (int j = 0; j < c; j++) {
                list.get(i).add(sc.nextInt());
            }
        }
        System.out.println(list.get(1).get(2));
        System.out.println(list);
    }
}
