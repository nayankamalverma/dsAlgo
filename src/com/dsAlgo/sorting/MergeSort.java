package com.dsAlgo.sorting;

import java.util.Arrays;

public class MergeSort {
    public static void main(String[] args) {
        int[] arr={67,43,97,45,45,5,2,3,1,4};
        // System.out.println(Arrays.toString(mergeSort(arr)));
        mergeSortInPlace(arr, 0, arr.length);
        System.out.println(Arrays.toString(arr));
    }

    private static int[] mergeSort(int[] arr){
        if(arr.length==1)return arr;
        int mid= arr.length/2;
        int[] left = mergeSort(Arrays.copyOfRange(arr,0,mid));
        int[] right = mergeSort(Arrays.copyOfRange(arr,mid,arr.length));
        return mergeArr(left,right);
    }

    private static int[] mergeArr(int[] arr1, int[] arr2) {
        int[] mix=new int[arr1.length+arr2.length];
        int i=0,j=0,k=0;
        while(i< arr1.length && j< arr2.length){
            if(arr1[i]>arr2[j]){
                mix[k]=arr2[j];
                j++;
            }else{
                mix[k]=arr1[i];
                i++;
            }
            k++;
        }
        while (i< arr1.length){
            mix[k]=arr1[i];
            i++;
            k++;
        }
        while (j< arr2.length){
            mix[k]=arr2[j];
            j++;
            k++;
        }
        return mix;
    }
    static void mergeSortInPlace(int[] arr,int s,int e){
        if(e-s==1)return;
        int mid= s+(e-s)/2;
        mergeSortInPlace(arr, s, mid);
        mergeSortInPlace(arr, mid, e);
        merge(arr,s,mid,e);
    }
    static void merge(int[] arr,int s,int m,int e){
        int[] mix= new int[e-s];
        int i=s;
        int j=m;
        int k=0;
        while(i<m && j<e){
            if(arr[i]<arr[j]){
                mix[k]=arr[i];
                i++;
            }else{
                mix[k]=arr[j];
                j++;
            }
            k++;
        }
        while(i>m){
            mix[k]=arr[i];
            k++;
            i++;
        }
        while(j>e){
            mix[k]=arr[i];
            k++;
            i++;
        }
        for(int x=0;x<mix.length;x++){
            arr[s+x]=mix[x];
        }
    }
}
