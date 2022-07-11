package com.dsAlgo.String;

//https://leetcode.com/problems/defanging-an-ip-address/

public class DefanginganIPAddress {
    public static void main(String[] args) {
        String str="1.1.1.1";
        System.out.println(defangIPaddr(str));
    }
    public static String defangIPaddr(String address) {
        return address.replace(".","[.]");
//        StringBuilder sb= new StringBuilder(address);
//        int k=0;
//        for (int i = 0; i < address.length(); i++) {
//            if(address.charAt(i)=='.'){
//                sb.deleteCharAt(i+k);
//                sb.insert(i+k,"[.]");
//                k+=2;
//            }
//        }
//        return sb.toString();
    }
}
