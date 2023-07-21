package org.example;

public class CountOddNumbersInAnIntervalRange1523 {
    public static void main(String[] args) {
        int low = 3, high = 6;
        System.out.println(countOdds(low, high));

    }

    public static int countOdds(int low, int high) {
        if(low%2!=0&&high%2!=0){
            return (high - low)/2 +1;
        }
        else if(low%2==0&&high%2==0){
            return (high - low)/2;
        } else  {
            return  (high-low)/2;
        }

    }

}
