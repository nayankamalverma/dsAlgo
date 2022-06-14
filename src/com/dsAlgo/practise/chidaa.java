package com.dsAlgo.practise;

import java.util.Arrays;

public class chidaa {
    public static void main(String[] args) {
        try{
            badMethod();
            System.out.print("A");
        }catch (Exception ex) {
            System.out.print("B");
        }finally {
            System.out.println("C");
        }
        System.out.println("D");
    }

    private static void badMethod() {
        throw  new Error();
    }
}
