package com.dsAlgo.recursion;

public class rotatedBinarySorted {
    public static void main(String[] args) {
        int[] arr= {67,69,72,81,95,102,3,4,5,34,45,56,57,64};
        int target= 72;
        System.out.println(rotatedBinarySearch(arr, target,0, arr.length-1));
    }

    private static int rotatedBinarySearch(int[] arr, int k, int s, int e) {
        if(s>e)return -1;
        int mid= s+(e-s)/2;
        if(arr[mid]==k)return mid;
        if(arr[s]<=arr[mid]){
            if(k>= arr[s] && k<=arr[mid]) {
                return rotatedBinarySearch( arr, k, s,mid-1);
            }else{
                return rotatedBinarySearch( arr, k, mid+1,e);
            }
        }
        if(k>=arr[mid] && k<= arr[e]){
            return rotatedBinarySearch( arr, k, mid+1,e);
        }
        return rotatedBinarySearch( arr, k, s,mid-1);
    }
}
