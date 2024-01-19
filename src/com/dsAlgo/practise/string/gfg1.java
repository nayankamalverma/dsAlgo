package com.dsAlgo.practise.string;

public class gfg1 {
    public static void main(String[] args) {
        String[] str= {"bbcb", "abccc", "abc"};
        System.out.println(noOfPairs(str));
    }

    public static long noOfPairs(String[] box){
    long ans=0;
        for(int i=0;i<box.length;i++){
            for(int j=i+1;j<box.length;j++){
                String x= box[i]+box[j];
                System.out.println(x);
                System.out.println();
                int[] freq= new int[26];
                for (int k = 0; k < x.length(); k++) {
                    freq[x.charAt(i)-97]++;
                }int cnt=0;
                for(int f:freq){
                    if(f%2==1)cnt++;
                    else if(cnt>1)break;
                }
                if(cnt==1)ans++;
            }
        }
        return ans;
    }
}
