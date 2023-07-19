package org.example;

import java.util.Arrays;

public class ValidAnagram_242 {
    public static void main(String[] args) {
        String s ="anagram";
        String t = "nagaram";
        System.out.println(isAnagram(s,t));

    }
    public static boolean isAnagram(String s, String t) {
        if(s.length()!=t.length()){
            return false;
        }
        char[] str1 = s.toCharArray();
        char[] str2= t.toCharArray();
        Arrays.sort(str1);
        Arrays.sort(str2);

        for (int i = 0; i < str1.length; i++) {
            if(str1[i]!=str2[i]){
                return false;
            }
        }
        return true;
    }
}
