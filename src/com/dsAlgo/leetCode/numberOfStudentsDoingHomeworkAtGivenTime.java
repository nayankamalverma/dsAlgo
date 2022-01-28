
//https://leetcode.com/problems/number-of-students-doing-homework-at-a-given-time/

package com.dsAlgo.leetCode;

public class numberOfStudentsDoingHomeworkAtGivenTime {
    public int busyStudent(int[] startTime, int[] endTime, int queryTime) {
        int cnt=0;
        for(int i=0;i<startTime.length;i++){
            if(startTime[i]<=queryTime && endTime[i]>=queryTime){
                cnt++;
            }
        }
        return cnt;
    }
}
