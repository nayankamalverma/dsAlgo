//You are given an array items, where each items[i] = [typei, colori, namei] describes the type, color, and name of the ith item. You are also given a rule represented by two strings, ruleKey and ruleValue.
//
//        The ith item is said to match the rule if one of the following is true:
//
//        ruleKey == "type" and ruleValue == typei.
//        ruleKey == "color" and ruleValue == colori.
//        ruleKey == "name" and ruleValue == namei.
//        Return the number of items that match the given rule.
//
//
//
//        Example 1:
//
//        Input: items = [["phone","blue","pixel"],["computer","silver","lenovo"],["phone","gold","iphone"]], ruleKey = "color", ruleValue = "silver"
//        Output: 1
//        Explanation: There is only one item matching the given rule, which is ["computer","silver","lenovo"].

//Constraints:
//
//        1 <= items.length <= 104
//        1 <= typei.length, colori.length, namei.length, ruleValue.length <= 10
//        ruleKey is equal to either "type", "color", or "name".
//        All strings consist only of lowercase letters.

package com.dsAlgo.leetCode;

import java.util.ArrayList;
import java.util.Objects;
import java.util.Scanner;

public class countItemsMatchingARule {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Rulekey: ");
        String ruleKey= sc.next();
        System.out.println("Rule Value: ");
        String ruleValue= sc.next();
        System.out.println("Enter no of row: ");
        int n = sc.nextInt();
        ArrayList<ArrayList<String>> arr= new ArrayList<>();
        for (int i = 0; i < n; i++) {
            arr.add(new ArrayList<>());
        }
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < 3; j++) {
                arr.get(i).add(sc.next());
            }
        }
        System.out.println(matchRuleCount(arr,ruleKey,ruleValue));
    }

    static int matchRuleCount(ArrayList<ArrayList<String>> items, String ruleKey, String ruleValue) {
        int cnt=0;
        for (ArrayList<String> item : items) {
            if ("type".equals(ruleKey)) {
                if (item.get(0).equals(ruleValue))
                    cnt++;
            } else if ("color".equals(ruleKey)) {
                if (item.get(1).equals(ruleValue))
                    cnt++;
            } else {
                if (item.get(2).equals(ruleValue))
                    cnt++;
            }
        }
        return cnt;
    }
}
