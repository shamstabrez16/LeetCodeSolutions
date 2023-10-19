package org.example;

public class MergeStringsAlternately_1768 {

    public static void main(String[] args) {
        String word1 = "abcd";
        String word2 = "pqrs";
        System.out.println(mergeAlternately(word1, word2));
    }

    public static String mergeAlternately(String word1, String word2) {
        int length = Math.min(word1.length(), word2.length());
        int word1Length = word1.length();
        int word2Length = word2.length();
        StringBuilder result = new StringBuilder();
        for (int i = 0; i < length+1; i++) {
            if (i < word1Length && i< word2Length) {
                result.append(word1.charAt(i));
                result.append(word2.charAt(i));
            } else if(i < word1.toCharArray().length ) {
                result.append(word1.substring(i));
                break;
            }
            else {
                result.append(word2.substring(i));
                break;
            }
        }
        return result.toString();
    }
}
