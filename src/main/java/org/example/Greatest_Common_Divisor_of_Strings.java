package org.example;


public class Greatest_Common_Divisor_of_Strings {
    public static void main(String[] args) {
        String str1 = "TAUXXTAUXXTAUXXTAUXXTAUXX", str2 = "TAUXXTAUXXTAUXXTAUXXTAUXXTAUXXTAUXXTAUXXTAUXX";
        System.out.println(gcdOfStrings(str1, str2 ));
    }
    public  static String gcdOfStrings(String str1, String str2) {
        if(str1.length()<str2.length()){
            return gcdOfStrings(str2,str1);
        }
        else if(!str1.startsWith(str2)){
          return "";
       } else if (str2.isEmpty()) { // gcd string found.
            return str1;
        }else { // cut off the common prefix part of str1.
            return gcdOfStrings(str1.substring(str2.length()), str2);
        }
    }
}
