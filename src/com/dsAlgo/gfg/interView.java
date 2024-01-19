package com.dsAlgo.gfg;

public class interView {
    public static void main(String[] args) {
        String s ="111000000000000000000000000000";
        System.out.println(calculateNumberOfDays(s));
    }
    static int calculateNumberOfDays(String s) {
        int totalInterview=0;
        int skipedDays=0;
        for(int i=0;i<s.length();i++){
            char day=s.charAt(i);
            if(day=='1'){
                totalInterview++;
                skipedDays=0;
            }else{
                skipedDays++;
                if(skipedDays==2){
                    totalInterview++;
                    skipedDays=0;
                }
            }
        }
        return totalInterview;
    }
}
