package com.dsAlgo;

import java.util.Scanner;

public class helloWorld {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter your name: ");
        String n = sc.next();
	    System.out.println("Hello, "+ n +" \nWelcome to Java classes!!!");
        int y = sc.nextInt();
        if(functionMain.leapYear(y))
            System.out.println("leap year..");
        else
            System.out.println("Not a leap year..");
        sc.close();
    }
}
