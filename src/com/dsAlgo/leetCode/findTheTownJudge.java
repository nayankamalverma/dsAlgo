package com.dsAlgo.leetCode;

public class findTheTownJudge {
    public int findJudge(int n, int[][] trust) {
        int [][] arr = new int[n+1][2];
        for(int i=0 ;i<trust.length;i++){
            arr[trust[i][0]][0]+=1;
            arr[trust[i][1]][1]+=1;
        }
        for(int i=1;i<=n;i++){
            if(arr[i][0]==0 && arr[i][1]==n-1){
                return i;
            }
        }
        return -1;
    }
}
