package com.dsAlgo.leetCode.binarySearch;

public class searchPivotInRotatedSortedArrayWithDuplicate {
    public static void main(String[] args) {
        int[] arr = new int[]{1,1,1,1,1,1,0,1,1};
        System.out.println(searchPivot(arr));
    }
    public static int searchPivot(int[] arr){
        int s=0,e=arr.length-1;
        while(s<e){
            int m= s+(e-s)/2;
            if(m>0 && arr[m-1]>arr[m]){
                return m-1;
            }else if(arr[s]==arr[m] && arr[m]==arr[e]){
                if(arr[s]>arr[s+1]){
                    return s;
                }s++;
                if(arr[e-1]>arr[e]){
                    return e-1;
                }e--;
            }else if(arr[s]<arr[m] && arr[m]>arr[e]){
                s=m+1;
            }else{
                e=m-1;
            }
        }
        return s;
    }
//    public static int searchPivot(int[] arr){
//        int s=0,e=arr.length-1;
//        while(s<=e){
//            int m= s+(e-s)/2;
//            if(m>0 && arr[m-1]>arr[m]){
//                return m-1;
//            } else if(m<arr.length-1 && arr[m]>arr[m+1]){
//                return m;
//            }else if(arr[s]==arr[m] && arr[m]==arr[e]){
//                if(arr[s]>arr[s+1]){
//                    return s;
//                }else if(arr[e-1]>arr[e]){
//                    return e-1;
//                }e--;
//                s++;
//            }else if(arr[s]<arr[m] || arr[s]==arr[m] && arr[m]>arr[e]){
//                s=m+1;
//            }else{
//                e=m-1;
//            }
//        }
//        return -1;
//    }


}
