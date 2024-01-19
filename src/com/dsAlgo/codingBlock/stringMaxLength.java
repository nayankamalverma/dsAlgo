/*
Kartik Bhaiya has a string consisting of only 'a' and 'b' as the characters. Kartik Bhaiya describes perfectness of a string as the maximum length substring of equal characters. Kartik Bhaiya is given a number k which denotes the maximum number of characters he can change. Find the maximum perfectness he can generate by changing no more than k characters.

Input Format
The first line contains an integer denoting the value of K. The next line contains a string having only ‘a’ and ‘b’ as the characters.

Constraints
2 ≤ N ≤ 10^6

Output Format
A single integer denoting the maximum perfectness achievable.

Sample Input
2
abba
Sample Output
4
Explanation
We can swap the a's to b using the 2 swaps and obtain the string "bbbb". This would have all the b's and hence the answer 4.
Alternatively, we can also swap the b's to make "aaaa". The final answer remains the same for both cases.
*/

package com.dsAlgo.codingBlock;

import java.util.Scanner;

public class stringMaxLength {
        public static void main(String args[]) {
            Scanner sc = new Scanner(System.in);
            int x=sc.nextInt();
            String s = sc.next();
            System.out.println(maxLength(s,x));
            sc.close();
        }
        private static int maxLength(String str,int n){
            int len=0;
            for(int i=0;i<str.length(); ){
                int cnt=1;
                char c = str.charAt(i);
                i++;
                while(i<str.length() || c==str.charAt(i)){
                    cnt++;
                    i++;
                }
                if(cnt>len)len=cnt;
            }
            if(len+n>str.length())return str.length();
            else return len+n;
        }
}
