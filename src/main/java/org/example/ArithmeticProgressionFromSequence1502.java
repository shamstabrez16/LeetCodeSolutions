package org.example;

import java.util.Arrays;

public class ArithmeticProgressionFromSequence1502 {
    public static void main(String[] args) {
        int[] arr = {3,5,1};
        System.out.println(canMakeArithmeticProgression(arr));
    }

    public static boolean canMakeArithmeticProgression(int[] arr) {
        Arrays.sort(arr);
        int diff = arr[1]-arr[0];
        for (int i = 1; i < arr.length; i++) {
            if(diff!=arr[i]-arr[i-1]){
                return false;
            }
        }
        return true;
    }
}
