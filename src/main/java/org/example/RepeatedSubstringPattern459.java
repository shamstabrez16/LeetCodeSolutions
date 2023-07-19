package org.example;

import java.util.*;

public class RepeatedSubstringPattern459 {
    public static void main(String[] args) {

        String s = "abaababaab";
       System.out.println(repeatedSubstringPattern(s));
    }



        public static boolean repeatedSubstringPattern (String s){

            ArrayList<Integer> fact = new ArrayList<>();
            for (int i = 1; i <= s.length() / 2; i++) {
                if (s.length() % i == 0) {
                    fact.add(i);
                }
            }

            for (Integer integer : fact) {
                StringBuilder model = new StringBuilder();
                for (int j = 0; j < s.length(); j = j + integer) {
                    model.append(s, 0, integer);
                }
                if (model.toString().equals(s)) {
                    return true;
                }
            }
            return false;

        }
    }


