package com.dsAlgo.array;

public class rotationCount {
    public static void main(String[] args) {
//        Scanner sc = new Scanner(System.in);
        int[] arr={4,5,6,7,9,10,17,0,1,2,3};
        int r=rotateCount(arr);
        if (r != -1) {
            System.out.println("Rotated " + r + " times.");
        } else {
            System.out.println("Array not rotated.");
        }
    }

    private static int rotateCount(int[] arr) {
        int s=0,e=arr.length-1;
        while(s<=e){
            int m=s+(e-s)/2;
            if (arr[m]>arr[m+1]){
                return m+1;
            }else if(arr[m]<arr[m-1]){
                return m;
            }else if(arr[m]<arr[s]){
                e=m-1;
            }else if(arr[m]>arr[s]){
                s=m+1;
            }
        }
        return -1;
    }
}
