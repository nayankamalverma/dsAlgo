package com.dsAlgo;

public class range {
    public static void main(String[] args) {
        for(int i=100;i<=200;i++){
            int n=i;
            int cnt=0;
            while(n>0){
                cnt++;
                n/=10;
            }
            if(cnt%2==0){System.out.println(i);}
        }
    }
}