package com.dsAlgo;

import java.util.Scanner;

public class
maxAndMinAmong3 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter three int to compare: ");
        int a = scanner.nextInt();
        int b = scanner.nextInt();
        int c = scanner.nextInt();
        System.out.println("maximum value among 3 number is "+ functionMain.max(a,b,c));
        System.out.println("minimum value among 3 number is "+ functionMain.min(a,b,c) );
        boolean x = functionMain.prime(functionMain.max(a,b,c));
        boolean y = functionMain.armstrong(functionMain.max(a,b,c));
        if(x){
            System.out.println(functionMain.max(a,b,c) + " is a prime number.");
        }else {
            System.out.println(functionMain.max(a,b,c) +" Not a prime number.");
        }

        if(y){
            System.out.println(functionMain.max(a,b,c) + " is a Armstrong number.");
        }else {
            System.out.println(functionMain.max(a,b,c) +" Not a Armstrong number.");
        }

    }


}
