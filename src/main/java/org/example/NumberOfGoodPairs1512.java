package org.example;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;

public class NumberOfGoodPairs1512 {
    public static int numIdenticalPairs(int[] nums) {
        int count = 0;
      HashMap<Integer,Integer> map = new HashMap<>();
        for (int i = 0; i < nums.length; i++) {
         int tmp = map.getOrDefault(nums[i],0);
         count = count+ tmp;
         map.put(nums[i],tmp+1);

        }
        return  count;

    }

    public static void main(String[] args) {
        int [] nums = {1,2,3,1,1,3};
        System.out.println(numIdenticalPairs(nums));
    }
}
