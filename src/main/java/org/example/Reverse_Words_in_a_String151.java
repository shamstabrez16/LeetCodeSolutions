package org.example;

public class Reverse_Words_in_a_String151 {
    public static String reverseWords(String s) {
       StringBuilder builder = new StringBuilder();
       String[] words = s.split("");
        for (int i = words.length-1; i >=0; i--) {
            if(!words[i].equals(" ")){
                builder.append(words[i]);
                builder.append(" ");
            }
        }
        return builder.toString().trim();
    }
    public static void main(String[] args)
    {
        String  s = "a good   example";
        reverseWords(s);
    }

}
