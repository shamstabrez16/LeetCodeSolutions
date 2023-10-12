package org.example;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

public class ContainsDuplicate217 {
    public static boolean containsDuplicate(int[] nums) {
        Map<Integer,Integer> map = new HashMap<>();
        Arrays.sort(nums);
        for (int n :nums) {
            if(map.containsKey(n)){
                return false;
            }else{
                map.put(n,1);
            }

        }
        return true;
    }
    public static void main(String[] args) {
        int[] nums = {1,2,3,1};

    }
}
