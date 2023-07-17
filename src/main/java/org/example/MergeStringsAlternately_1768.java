package org.example;

public class MergeStringsAlternately_1768 {

    public static void main(String[] args) {
        String word1 = "abcd";
        String word2 = "pqrs";
        System.out.println(mergeAlternately(word1, word2));
    }

    public static String mergeAlternately(String word1, String word2) {
        int length = Math.max(word1.length(), word2.length());
        StringBuilder result = new StringBuilder();
        for (int i = 0; i < length; i++) {
            if (i < word1.toCharArray().length && i< word2.toCharArray().length) {
                result.append(word1.toCharArray()[i]);
                result.append(word2.toCharArray()[i]);
            } else if(i < word1.toCharArray().length ) {
                result.append(word1.toCharArray()[i]);
            }
            else {
                result.append(word2.toCharArray()[i]);
            }
        }
        return result.toString();
    }
}
