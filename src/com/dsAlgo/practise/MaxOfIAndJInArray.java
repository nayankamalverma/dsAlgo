package com.dsAlgo.practise;
/*
* given an array arr=[1,15,13,8]
*
* we have to find maximum value of
*   |arr[i]-arr[j]| - |i-j|
* */
public class MaxOfIAndJInArray {
    public static void main(String[] args) {
        int[] a ={1,15,13,8};
        System.out.println(maxValue(a));
        System.out.println(maxValue2(a));
    }

    //
//    bruteForce
    static int maxValue(int[] arr){
        int max=0;
        for(int i=0;i< arr.length;i++){
            for(int j=0;j< arr.length ;j++){
                if(i==j)continue;
                int temp= Math.abs(arr[i]-arr[j])+Math.abs(i-j);
                max=Math.max(max,temp);
            }
        }
        return max;
    }

    // Optimal
    static int maxValue2(int[] arr){

//        case 1 a[i]>a[j]
//        a[i] - a[j] + i-j
//        on removing mod (a[i]+1)-(a[j]+j)
//                          max x - min y

//        case 2 a[i]<a[j]
//        a[j] - a[i] + i-j
//        on removing mod (i-a[i])-(j-a[j])
//                          max x - min y


        int max1=Integer.MIN_VALUE,min1=Integer.MAX_VALUE, max2=Integer.MIN_VALUE,min2=Integer.MAX_VALUE;;
        for(int i=0;i<arr.length;i++){
//          for  case1
            int temp1=arr[i]+i;
            max1=Math.max(max1,temp1);
            min1= Math.min(min1,temp1);
//          for case 2
            int temp2=i-arr[i];
            max2=Math.max(max2,temp2);
            min2= Math.min(min2,temp2);
        }
//        System.out.println(Math.max(Math.max(3,4),Math.max(5,6)));
        return Math.max((max1-min1),(max2-min2));

    }
}
