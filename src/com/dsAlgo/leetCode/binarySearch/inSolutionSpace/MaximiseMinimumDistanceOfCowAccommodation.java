package com.dsAlgo.leetCode.binarySearch.inSolutionSpace;

/*
    given a array (arr)of length n arr[i] is place were cow can be accommodated
    arr=[1,2,4,8,9]
    no of cow =3
    we need to find Maximum of minimum distance between cows
    above example
    ans= 3 // 4-1
    cow placed at position 1,4,9

*/
public class MaximiseMinimumDistanceOfCowAccommodation {
    public static void main(String[] args) {

    }
    public static boolean isPossibleToAccommodate(int[] arr,int n,int minDis){
        int max=arr[arr.length-1];
        int dis=arr[0];
        n--;
        while(n>0){
            dis+=minDis;
            if(dis>max && n>0)return false;

        }
        return true;
    }
}
