package com.dsAlgo.practise;

import java.util.Arrays;

public class chidaa {

    public static void main(String[] args) {
        char[] a={'c','d','e','f','g','i'};
        for (int i = 1; i <=6 ; i++) {
            a[i-1]= (char) (a[i-1]+i);
        }
    }

    //    public static void main(String[] args) {
//        int x=50,y,s=0,m,n,t,u;
//        y=x;
//        for ( m = 0; y!=0; y/=10) {
//            u=y%9;
//            for (n=m,t=1;n>=0;n--) {
//                t *= 9;
//            }
//            if(u<5)u+=3;
//            s=s*u+t;
//        }
//        System.out.print(s);
//    }
}
