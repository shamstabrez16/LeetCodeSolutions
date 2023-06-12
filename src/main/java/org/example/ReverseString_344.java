package org.example;

public class ReverseString_344 {
    public void reverseString(char[] s) {
        char k=' ';
        for (int i = 0; i < s.length/2; i++) {
            k=s[i];
            s[i] =s[s.length-i-1];
            s[s.length-i-1] =k;
        }
    }
}
