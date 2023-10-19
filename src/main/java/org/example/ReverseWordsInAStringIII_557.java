package org.example;

public class ReverseWordsInAStringIII_557 {
    public static String reverseWords(String s) {
        StringBuilder res = new StringBuilder();
            String[] words = s.split(" ");
        for (String word: words) {
            for (int i = word.length()-1; i >=0; i--) {
                res.append(word.charAt(i));
            }
            res.append(" ");
        }
        return res.toString().trim();
    }
    public static void main(String[] args)
    {
        String s = "Let's take LeetCode contest";

       System.out.println(reverseWords(s));
    }
}
