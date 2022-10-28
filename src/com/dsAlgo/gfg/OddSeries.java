package com.dsAlgo.gfg;

import java.util.Scanner;

class OddSeries{
    public static void main(String[] Args){
        Scanner sc = new Scanner(System.in);
        int t= sc.nextInt();
        while(t>0){
            System.out.println(findNth(sc.nextInt()));
            t--;
        }
    }

    static int findNth(int n){
        long m=1000000007;
        if(n==0 || n==1){
            return (int) (n%m);
        }else if(n%5==0){
                return (int) (11%m);
        }
        return (int) ((findNth(n-1)+findNth(n-2))%m);
    }
}