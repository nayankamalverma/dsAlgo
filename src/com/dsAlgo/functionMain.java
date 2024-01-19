package com.dsAlgo;

public class functionMain {
    public static void main(String[] args) {
        System.out.println(pallindrome(1221));
    }


    public static int min(int x, int y, int z) { //using function overloading
        int min;
        if (x < y) {
            min = Math.min(x, z);
        } else {
            min = Math.min(y, z);
        }
        return min;
    }

    public static int max(int x, int y, int z) { //using function overloading
        int max;
        if (x > y) {
            max = Math.max(x, z);
        } else {
            max = Math.max(y, z);
        }
        return max;
    }


    public static void fibbo(int n) {
        int a = 0, b = 1, c;
        System.out.print(a + " " + b);
        n -= 2;
        while (n != 0) {
            c = a + b;
            System.out.print(" " + c);
            a = b;
            b = c;
            n--;
        }
    }

    public static boolean armstrong(int n) {
        int sum = 0, temp = n;
        while (n != 0) {
            sum = sum + (n % 10) * (n % 10) * (n % 10);
            n /= 10;
        }
        return sum == temp;
    }

    public static boolean pallindrome(int n){
        int temp=n;
        int rev=0;
        while(n>0){
            int dig= n%10;
            rev=(rev*10)+dig;
            n/=10;
        }
        return rev==temp;
    }

    public static boolean prime(int n) {
        if (n <= 1) {
            return false;
        }
        int i = 2;
        while (i * i <= n) {
            if (n % i == 0) {
                return false;
            }
            i++;
        }
        return i * i > n;
    }

    public static boolean leapYear(int y) {
        return ((y % 4 == 0 && y % 100 != 0) || y % 400 == 0) ;
    }
}