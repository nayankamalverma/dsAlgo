package com.dsAlgo.array;

import java.util.ArrayList;
import java.util.Arrays;

public class SpiralMatrix {
    public static void main(String[] args) {
        int[][] arr=new int[][]{{1,2,3},{4,5,6},{7,8,9}};
        System.out.println(spiral(arr));
    }

    private static ArrayList<Integer> spiral(int[][] arr) {
        ArrayList<Integer> ans= new ArrayList<>();
        int top=0,left=0,right=arr[0].length-1,bottom=arr.length-1,cnt=(right+1)*(bottom+1),dir=1;

        while(cnt>0 && top<=bottom && left<=right ){
            if(dir==1){
                for(int i=left;i<=right;i++){
                    ans.add(arr[top][i]);
                }
                top++;
                cnt--;
                dir=2;
            }else if(dir==2){
                for(int i=top;i<=bottom;i++){
                    ans.add(arr[i][right]);
                }
                right--;
                cnt--;
                dir=3;
            }else if(dir==3){
                for(int i=right;i>=left;i--){
                    ans.add(arr[bottom][i]);
                }
                bottom--;
                cnt--;
                dir=4;
            }else {
                for(int i=bottom;i>=top;i--){
                    ans.add(arr[i][left]);
                }
                left++;
                cnt--;
                dir=1;
            }
        }
        return ans;
    }
}
