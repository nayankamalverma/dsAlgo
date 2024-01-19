package com.dsAlgo.recursion;

import java.util.Scanner;

class NoOfTower{

    static int cnt=0;
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t=sc.nextInt();
        while(t>0){
            int n=sc.nextInt();
            int h=sc.nextInt();
            int m= sc.nextInt();
            cnt =0;
            n-=m;
            h--;
            if(n<=0 || m==0 || h==0){
                if((m==0 && h==0) || n<=0){
                    if(n<=0 || (m==0 && h==0)){

                    }else if(n==0 && h==0){
                        cnt++;
                    }else{
                        cnt++;
                    }
                }
                else{
                    addOne(n,h,m);
                    subOne(n,h,m);
                }
            }
            System.out.println(cnt);
            t--;
        }
    }

    private static void addOne(int n,int h,int m){
        n-=m;
        h-=1;
        m+=1;
        if(n<=0 || m==0 || h==0 ){
            if(n<=0 || (m==0 && h==0)){
                return;
            }else if(n==0 && h==0)cnt++;
            else cnt++;
        }else{
            addOne(n,h,m);
            subOne(n,h,m);
        }
    }

    private static void subOne(int n,int h,int m){
        n-=m;
        h-=1;
        m-=1;
        if(n<=0 || m==0 || h==0 ){
            if(n<=0 || (m==0 && h==0)){
                return;
            }else if(n==0 && h==0)cnt++;
            else cnt++;
        }else{
            addOne(n,h,m);
            subOne(n,h,m);
        }
    }
}