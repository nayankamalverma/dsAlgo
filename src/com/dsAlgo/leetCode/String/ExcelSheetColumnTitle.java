package com.dsAlgo.leetCode.String;

import java.io.Console;

public class ExcelSheetColumnTitle {
    /*
    168. Excel Sheet Column Title

    Given an integer columnNumber, return its corresponding column title as it appears in an Excel sheet.
    For example:

A -> 1
B -> 2
C -> 3
...
Z -> 26
AA -> 27
AB -> 28
...
     */
    public static void main(String[] args) {
        System.out.println(convertToTitle(312));
    }
    static String convertToTitle(int n) {
        return n == 0 ? "" : convertToTitle(--n / 26) + (char)('A' + (n % 26));
    }
}
