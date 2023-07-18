package org.example;

import java.util.HashMap;
import java.util.Map;

public class WordPattern_290 {
    public static void main(String[] args) {
        String pattern = "abba", s = "dog dog dog dog";
        System.out.println(wordPattern(pattern,s));
    }
    public static boolean wordPattern(String pattern, String s) {
    String[] splitS = s.split(" ");
    if(splitS.length!= pattern.length()){
        return false;
    }
    Map<Character ,String> map = new HashMap<>();
        for (int i = 0; i < splitS.length; i++) {
            if(!map.containsValue(splitS[i])){
                if(!map.containsKey(pattern.toCharArray()[i])){
                    map.put(pattern.toCharArray()[i],splitS[i]);
                }
                else {
                    return false;
                }

            }
            else {
                if(!map.containsKey(pattern.toCharArray()[i])){
                    return false;
                }
               if(!map.get(pattern.toCharArray()[i]).equals(splitS[i])){
                 return false;
             }
            }
        }
        return true;
    }
}
