package com.dsAlgo.leetCode;

public class ContainerWithMostWater {
    public static void main(String[] args) {
        int[] arr={1,8,6,2,5,4,8,3,7};
        System.out.println(maxArea(arr));
    }

    public static int maxArea(int[] height) {
        int n=height.length;
        int s=0,e=n-1,max=1;
        while(s<e){
            max = Math.max(((e-s)*(Math.min(height[e],height[s]))),max);
            if(s+1<n && height[s+1]>height[e]){
                e--;
            }else{
                s++;
            }
        }
        return max;
    }

}
