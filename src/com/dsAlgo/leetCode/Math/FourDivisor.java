package com.dsAlgo.leetCode.Math;
/*
*
 Input: nums = [21,4,7]
Output: 32
Explanation:
21 has 4 divisors: 1, 3, 7, 21
4 has 3 divisors: 1, 2, 4
7 has 2 divisors: 1, 7
The answer is the sum of divisors of 21 only.
*
* */
public class FourDivisor {

    public static void main(String[] args) {
        System.out.println(sumFourDivisors(new int[]{21,7,4}));
    }

    public static int sumFourDivisors(int[] nums) {
        int sum=0;
        for(int i: nums){
            int divSum= getDivisorsSum(i);
            System.out.println(i+" "+divSum);
            sum+= divSum;
        }
        return sum;
    }

    private static int getDivisorsSum(int n){
        int cnt=0;
        int sum=n+1;
        for(int i=2;i*i<=n;i++){
            if(n%i==0){
                cnt++;
                if(cnt>1)return 0;
                sum+=i;
                if(i!=n/i) {
                    sum += n / i;
                }else return 0;
            }
        }
        return cnt==1?sum:0;
    }
}
