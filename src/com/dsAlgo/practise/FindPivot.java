package com.dsAlgo.practise;

public class FindPivot {
    public static void main(String[] args) {
        int[] arr={4,5,6,7,8,78,456,67887,1,1,2,3,};
        System.out.println(findPiv(arr));
    }

    private static int findPiv(int[] arr) {
        int s=0,e=arr.length;
        while(s<e){
           int m=s+(e-s)/2;
           if(m<e && arr[m]>arr[m+1])return m+1;
           else if(s<m && arr[m-1]>arr[m])return m;
           else if(arr[s]<arr[m])s=m+1;
           else e=m-1;
        }
        return e;
    }
}