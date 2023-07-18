package org.example;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

public class TwoSum_II_InputArrayIsSorted167 {
    public static void main(String[] args) {
        int[] numbers = {-1,0};
        int target = -1;
        System.out.println(Arrays.toString(twoSum(numbers, target)));
    }

    public static int[] twoSum(int[] numbers, int target) {

        Map<Integer, Integer> values = new HashMap<>(numbers.length);
        for (int i = 0; i < numbers.length; i++) {

            if (values.containsKey(numbers[i])) {
                return new int[]{values.get(numbers[i]),i + 1};
            } else {
                values.put( target - numbers[i],i + 1);
            }
        }
        return new int[]{};
    }
}
