package com.dsAlgo.leetCode.gameTheory;

//2660. Determine the Winner of a Bowling Game


public class DeterminingWinnerOfBowling {

    public static void main(String[] args) {
        int[] p1={3,4,10,7};
        int[] p2={9,9,9,9};
        System.out.println(isWinner(p1,p2));
    }

    public static int isWinner(int[] player1, int[] player2) {
        int n=player1.length;
        int p1=0,p2=0;
        int p1_10=0,p2_10=0;
        for(int i=0;i<n;i++){
            int sp1=player1[i],sp2=player2[i];
            p1+=sp1;
            p2+=sp2;
            if(p1_10>0){
                p1+=sp1;
                p1_10--;
            }
            if(p2_10>0){
                p2+=sp2;
                p2_10--;
            }
            if(sp1==10)p1_10=2;
            if(sp2==10)p2_10=2;

        }
        if(p1==p2)return 0;
        else if(p1>p2)return 1;
        return 2;
    }
}
