package com.dsAlgo.practise;

import java.util.Arrays;
import java.util.Scanner;

public class arraySearch2D {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String target=sc.next();
        System.out.println(Arrays.toString(indexOfString(target)));
    }
    public static int[] indexOfString(String target){
        int x= Integer.parseInt(target);
        int cnt=1;
        int[] ans=new int[2];
        for(int i=1;i<=5;i++){
            for(int j=1;j<=5;j++){
                    if(cnt==x){
                        ans[0]=i-1;
                        ans[1]=j-1;
                    }
                    cnt++;
                }
            }
        return ans;
        }
}
