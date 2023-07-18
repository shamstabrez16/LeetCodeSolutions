package org.example;

public class IsSubsequence392 {

    public static void main(String[] args){
        String s = "abc", t = "ahbgdc";
        System.out.println(isSubsequence(s,t));
    }
    public static  boolean isSubsequence(String s, String t) {
        int i,j=0;
        if(s.length()==0){
            return true;
        }
        if(t.length()==0){
            return false;
        }
        for (i=0; i < t.length(); i++) {
            if(s.charAt(j)==t.charAt(i)){
                j++;
                if(j==s.length()){
                    return true;
                }
            }
        }
        return false;
    }
}
