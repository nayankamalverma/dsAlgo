package com.dsAlgo.array;

public class binarySearch2dArray {
    public static void main(String[] args) {
        int[][] arr={{1,2,3,4},{5,6,7,8},{9,10,11,12},{13,14,15,17}};
        int t=7;
        System.out.println(Search2dArray(arr,t));
    }

    private static boolean Search2dArray(int[][] matrix, int target) {
        if(matrix.length==0)return false;
        int row=matrix.length,column=matrix[0].length;
        int s=0,e=row*column-1;
        while(s<=e){
            int m= s+(e-s)/2;
            int matrix_element=matrix[m/column][m%column];
            if(matrix_element==target){
                return true;
            }else if(matrix_element>target){
                e=m-1;
            }else {
                s=m+1;
            }
        }
        return false;
    }
}