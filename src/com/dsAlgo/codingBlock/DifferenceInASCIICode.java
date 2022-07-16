package com.dsAlgo.codingBlock;
import java.util.*;
public class DifferenceInASCIICode {
        public static void main(String[] args) {
            Scanner sc= new Scanner(System.in);
            String str = sc.next();
            System.out.println(diffranceAsciiCode(str));
            sc.close();
        }

        private static String diffranceAsciiCode(String str) {
            StringBuilder sb = new StringBuilder();
            for(int i=0;i<str.length()-1;i++){
                sb.append(str.charAt(i));
                sb.append(str.charAt(i+1)-str.charAt(i));
            }
            sb.append(str.charAt(str.length()-1));
            return sb.toString();
        }
}
