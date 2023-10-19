package org.example;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.OptionalInt;

public class KidsWithTheGreatestNumberOfCandies {

    public static void main(String[] args) {
        int[] candies = {2,3,5,1,3};
        int extraCandies = 3;

        System.out.println(kidsWithCandies(candies,extraCandies));
    }
    public static List<Boolean> kidsWithCandies(int[] candies, int extraCandies) {
       // int max = Arrays.stream(candies).max().orElseThrow();
        int max = 0;
        for (int candy : candies
        ) {
            max = Math.max(max,candy);

        }
        List<Boolean> res = new ArrayList<>();
        for (int candy : candies
        ) {
            res.add(candy+extraCandies>=max);

        }
        return  res;
    }

}
