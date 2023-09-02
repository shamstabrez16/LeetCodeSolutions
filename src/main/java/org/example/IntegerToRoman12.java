package org.example;

public class IntegerToRoman12 {

    public static void main(String[] args) {
        int  num = 8;
        System.out.println(intToRoman(num));
    }
    public static String intToRoman(int num) {
        StringBuilder result = new StringBuilder();
        int[] numerics = {1,4,5,9,10,40,50,90,100,400,500,900,1000};
        String[] romans = {"I","IV","V","IX","X","XL","L","XC","C","CD","D","CM","M"};
        for (int i = numerics.length-1; i >=0 ; i--) {
            while(num >= numerics[i]) {
                num -= numerics[i];
                result.append(romans[i]);
            }

        }
        return result.toString();
    }
}
