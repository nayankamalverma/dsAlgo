package com.dsAlgo.recursion;

public class PatternStar1 {
    public static void main(String[] args) {
        int n=5;
        patternStar01(n,0,0);
    }

    private static void patternStar01(int n,int space,int x) {
        if(n<=0)return;
        patternStar01(n-1,space+1,n%2==0?x:x+n);
        int i=n;
        int j=space;
        while (j>=0){
            System.out.print(" ");
            j--;
        }if(n%2==0){
            while (i>0){
                System.out.print("* ");
                i--;
            }
        }else{
            while (i > 0) {
                System.out.print((char)(65+x)+ " ");
                x++;
                i--;
            }
        }
        System.out.println();
    }
}
