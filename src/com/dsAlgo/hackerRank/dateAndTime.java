package com.dsAlgo.hackerRank;

import java.time.LocalDate;
import java.util.Date;
import java.util.Scanner;

public class dateAndTime {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
//        Date date ;
        int d,m,y;
        System.out.print("enter day: ");
        d= sc.nextInt();
        System.out.print("enter month: ");
        m =sc.nextInt();
        System.out.print("enter year: ");
        y=sc.nextInt();
        LocalDate day= LocalDate.of(y,m,d) ;
        sc.close();
        System.out.println(day.getDayOfWeek());
    }
}
