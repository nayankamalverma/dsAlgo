package com.dsAlgo.hackerRank;

import java.text.NumberFormat;
import java.util.Locale;
import java.util.Scanner;

public class currencyFormatter {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double c = sc.nextDouble();
        NumberFormat us = NumberFormat.getCurrencyInstance(Locale.US);
        NumberFormat in = NumberFormat.getCurrencyInstance (new Locale("en","IN"));
        NumberFormat cn = NumberFormat.getCurrencyInstance(Locale.CHINA);
        NumberFormat fr = NumberFormat.getCurrencyInstance(Locale.FRANCE);
        System.out.println("US: "+us.format(c));
        System.out.println("INDIA: "+in.format(c));
        System.out.println("CHINA: "+cn.format(c));
        System.out.println("FRANCE: "+fr.format(c));
        sc.close();

    }
}

