package com.dsAlgo.recursion;

public class pattern {
    public static void main(String[] args) {
        printDowntriangle(4,0);
        System.out.println();
        printDownPyramid(4,0,0,4);
        printupPyramid(4,0,4,4);

    }

    private static void printDownPyramid(int r, int c, int space,int i) {
        if(r==0) return;
        if(space >0){
            System.out.print(" ");
            printDownPyramid(r, c, --space,i);
        }else if(r>c) {
            System.out.print(" *");
            printDownPyramid(r,++c,space,i);
        }
        else {
            System.out.println();
            printDownPyramid(--r,0,i-r,i);
        }
    }

    private static void printupPyramid(int r, int c, int space,int i) {
        if(r==0) return;
        if(space >0){
            System.out.print("_");
            printupPyramid(r, c, --space,i);
        }else if(r>c) {
            printupPyramid(r,++c,space,i);
            System.out.print(" *");
        }
        else {
            printupPyramid(--r,0,i-r,i);
            System.out.println();
        }
    }

    private static void printDowntriangle(int r,int c){
        if(r==0)return;
        if(r>c) {
            System.out.print(" *");
            printDowntriangle(r,++c);
        }
        else {
            System.out.println();
            printDowntriangle(--r,0);
        }
    }
}


