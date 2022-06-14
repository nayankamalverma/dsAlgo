package com.dsAlgo.codingBlock;

import java.util.Scanner;

public class basics{
            public static void main(String[] args){
                //hcf(n1,n2)- to HCF/GCF
                //prime(n)
                Scanner sc= new Scanner(System.in);
//                int n1,n2;
//                n1= sc.nextInt();
//                n2= sc.nextInt();
//                System.out.println("HCF/GCF of "+n1+"&"+n2+" is "+hcf(n1,n2
//                ) );
                int n = sc.nextInt();
//                System.out.println(fact(n));
//                fibo(n);
                System.out.println(armStrong(n));
            }

    public static int hcf(int divident, int divisor) {
                while(divident%divisor!=0){
                    int rem = divident% divisor;
                    divident = divisor;
                    divisor= rem;
                }
                return divisor;
    }

    public static boolean prime(int n){
                for(int i=2;i<n;i++) {
                    if (n % i == 0)
                        return false;
                }
                return true;
    }

    public static int jeeMarks(int p,int q, int r){
                int mark=0;
                mark+=p*4;
                mark-=q*(2);
                mark-=r;
                return mark;
    }

    public static int fact(int n){
                if(n==1)
                    return 1;
                int fact=1;
                for(int i= 2;i<=n;i++){
                    fact*=i;
                }
                return fact;
    }

    private static void fibo(int n){
                int a=0,b=1,c;
        System.out.print("Fibonacci series: "+a+" "+b+" ");
                for(int i=1;i<=n;i++){
                   c=a+b;
                    System.out.print(c+" ");
                    a=b;
                    b=c;
                }
    }

    public static boolean armStrong(int n){
                int sum=0,temp=n;
                while (n>0){
                    int rem = n%10;
                    sum+=rem*rem*rem;
                    n/=10;
                }
        return temp == sum;
    }
}