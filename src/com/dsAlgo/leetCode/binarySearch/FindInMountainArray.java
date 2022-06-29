package com.dsAlgo.leetCode.binarySearch;

public class FindInMountainArray {
    public static void main(String[] args) {

    }
/*
    public int findInMountainArray(int target, MountainArray mountainArr) {
        int s=0,e=mountainArr.length()-1;
        //finding peek
        while(s<e){
            int m=s+(e-s)/2;
            if(mountainArr.get(m)<mountainArr.get(m+1)){
                s=m+1;
            }else{
                e=m;
            }
        }
        int peek=s;

        //searching first half
        s=0;
        e=peek;
        while(s<=e){
            int m=s+(e-s)/2;
            if(mountainArr.get(m)<target){
                s=m+1;
            }else if(mountainArr.get(m)>target){
                e=m-1;
            }else{
                return m;
            }
        }

        //searching second half
        s=peek;
        e=mountainArr.length()-1;
        while(s<=e){
            int m=s+(e-s)/2;
            if(mountainArr.get(m)<target){
                e=m-1;
            }else if(mountainArr.get(m)>target){
                s=m+1;
            }else{
                return m;
            }
        }
        return -1;
    }
    */
}
