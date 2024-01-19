package com.dsAlgo.gfg;

/*
*
* Input:
N = 6
Output:
1
Explanation:
Factors of 6 are 1, 2, 3 and 6.
Excluding 6 their sum is 6 which
is equal to N itself. So, it's a
Perfect Number.
*
*
* */

public class PerfectNumber {
    public static void main(String[] args) {
        System.out.println("ans : "+isPerfectNumber(28));
    }

    static int isPerfectNumber(long n) {
        long sum=1;
        if(n==1) return 0;
        for(long i=2;i*i<=n;i++){
            if(n%i==0){
                sum+=i;
                sum+=(n/i);
                System.out.println(i+"  "+n/i);
                System.out.println(sum);
            }
        }
        if(sum!=n)return 0;
        return 1;
    }
}
