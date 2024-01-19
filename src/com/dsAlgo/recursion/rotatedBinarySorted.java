package com.dsAlgo.recursion;

public class rotatedBinarySorted {
    public static void main(String[] args) {
        int[] arr= {67,69,72,81,95,102,3,4,5,34,45,56,57,64};
        int target= 2;
        System.out.println(target + " is present at index: " + rotatedBinarySearch(arr, target,0, arr.length-1));
    }

    private static int rotatedBinarySearch(int[] arr, int k, int s, int e) {
        if(s>e) return -1;
        int m= s+(e-s)/2;
        if(arr[m]==k)return m;
        else if(arr[s] <= arr[m]){
            if(k>=arr[s] && k<= arr[m])
                return rotatedBinarySearch(arr, k, s, m-1);
            else
                return rotatedBinarySearch(arr, k, m+1, e);
        } else if(k>=arr[m] && k<=arr[e]){
            return rotatedBinarySearch(arr, k, m+1, e);
        }
        return rotatedBinarySearch(arr, k, s, m-1);
    }
}
