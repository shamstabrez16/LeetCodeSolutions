package org.example;

public class ReverseVowelsOfAString {

    public static void main(String[] args) {
        String s = "ai";
        System.out.println(reverseVowels(s));
    }
    public static  String reverseVowels(String s) {
        int l = 0;
        int r = s.length()-1;
        StringBuilder sb = new StringBuilder(s);
        while(l<r){
            char lc =  sb.charAt(l);
            char rc = sb.charAt(r);
            if("aeiouAEIOU".indexOf(lc)<0){
                l++;
            }
            if("aeiouAEIOU".indexOf(rc)<0){
                r--;
            }
            if("aeiouAEIOU".indexOf(lc)>=0 && "aeiouAEIOU".indexOf(rc)>=0){
                char c= lc;
                lc = rc;
                rc= c;
                sb.setCharAt(l,lc);
                sb.setCharAt(r,rc);
                l++;
                r--;
            }
        }
        return  sb.toString();
    }
}
