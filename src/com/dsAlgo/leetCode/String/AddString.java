package com.dsAlgo.leetCode.String;

public class AddString {
    public static void main(String[] args) {

    }
        public String addStrings(String num1, String num2) {
            StringBuilder sb= new StringBuilder();
            int carry=0;
            int len1=num1.length();
            int len2=num2.length();
            if(len1>len2){
                for(int i=0;i<len2;i++){
                    int n=((num2.charAt(len2-i-1))-'0')+((num1.charAt(len1-i-1))-'0')+carry;
                    carry=n/10;
                    sb.append(n%10);
                }
//             add remaining half of string num1 in sb
                for(int i=0;i<len1-len2+1;i++){
                    int n=((num1.charAt(len1-i-1))-'0')+carry;
                    carry=n/10;
                    sb.append(n%10);
                }
            }else{
                for(int i=0;i<len1;i++){
                    int n=((num2.charAt(len2-i-1))-'0')+((num1.charAt(len1-i-1))-'0')+carry;
                    carry=n/10;
                    sb.append(n%10);
                }
                for(int i=0;i<len2-len1+1;i++){
                    int n=((num2.charAt(len2-i-1))-'0')+carry;
                    carry=n/10;
                    sb.append(n%10);
                }
            }
            if(carry!=0){
                sb.append(carry);
            }
            return sb.reverse().toString();
        }
}
