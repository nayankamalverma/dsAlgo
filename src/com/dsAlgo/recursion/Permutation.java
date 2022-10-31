package com.dsAlgo.recursion;
import java.util.ArrayList;
import java.util.Scanner;

public class Permutation {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str = sc.next();
        System.out.println(permutation(str));
        sc.close();
    }

    private static ArrayList<String> permutation(String str){
        if(str.length()==0){
            ArrayList<String> result= new ArrayList<>();
            result.add("");
            return result;
        }
        ArrayList<String> ans = new ArrayList<>();
        ArrayList<String> subStr = permutation(str.substring(1));
        return ans;
    }
}
