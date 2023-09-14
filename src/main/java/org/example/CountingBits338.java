package org.example;

import java.util.Arrays;

public class CountingBits338 {


    public static int[] countBits(int n) {
        int[] result = new int[n+1];
        for (int i = 0; i <= n; i++) {
            String bin = Integer.toBinaryString(i);
            int l = bin.replace("0","").trim().length();
            result[i]=l;
        }
        return result;

    }

    public static void main(String[] args) {
       ;
        System.out.println(Arrays.toString(countBits(5)));
    }
}
