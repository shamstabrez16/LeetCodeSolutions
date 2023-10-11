package org.example;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

public class MajorityElement_169 {

    public static void main(String[] args) {
        int[] nums = {3,2,3};
        System.out.println(majorityElement(nums));
    }

    public static  int majorityElement(int[] nums) {
        int count= 0;
        int res = nums[0];

        Arrays.sort(nums);
        Map<Integer,Integer> map = new HashMap<>();
        for (int n :nums
             ) {
            if (map.containsKey(n)) {
                map.put(n, map.get(n) + 1);
            } else {
                map.put(n, 1);
            }

            if(map.get(n)>nums.length/2){
                return n;
            }

        }


        for (int n :nums
        ) {
                if (map.get(n) > count) {
                    res = n;
                    count = map.get(n);
                }

        }
        return res;
    }
}
