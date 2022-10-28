package com.dsAlgo.recursion;

public class SunOFDigit {
    public static void main(String[] args) {
        int num=1342;
        System.out.println(sumOfDig(num));
    }
    private static int sumOfDig(int n){
        if(n<=0){
            return 0;
        }
        return  n%10 +  sumOfDig(n/10);
    }

}
