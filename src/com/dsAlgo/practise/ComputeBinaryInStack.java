package com.dsAlgo.practise;

import java.util.Scanner;
import java.util.Stack;

public class ComputeBinaryInStack {
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        String str= sc.next();
        StringBuilder res = new StringBuilder();
        int n= str.length();
        Stack<String> s = new Stack<>();
        for (int i = n; i >0 ; i--) {
            s.push(String.valueOf(i+1));
            if(i==str.length() || str.charAt(i)-'0'==1){
                while (!s.isEmpty()){
                    res.append(s.peek());
                    s.pop();
                }
            }
        }
        System.out.println(res);
    }
}
