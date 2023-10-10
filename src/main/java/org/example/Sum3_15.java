package org.example;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.stream.Collectors;

public class Sum3_15 {
    public static List<List<Integer>> threeSum(int[] nums) {
        //Arrays.sort(nums);
        List<List<Integer>> results = new ArrayList<>();
        HashMap<Integer,Integer> map = new HashMap<>();
        for (int i = 0; i < nums.length; i++) {
            map.put(nums[i],i);
        }
        for (int i = 0; i < nums.length; i++) {
            for (int j =i+1; j < nums.length; j++) {
                int k = nums[i]+nums[j];
                if(map.containsKey(k)){
                    if(k+nums[i]+nums[j]==0 && (i!=j&& j!=k)){
                       int[] row = new int[3];
                        row[0]= nums[i];
                        row[1]= nums[j];
                        row[2]= k;
                        Arrays.sort(row);
                        List<Integer> list = Arrays.stream(row).boxed().toList();
                        if(!results.contains(list)){
                            results.add(list);
                        }

                    }
                }


            }
        }
        return results;
    }

    public static void main(String[] args) {
        int[] nums = {-1,0,1,2,-1,-4};
        System.out.println(threeSum(nums));

    }
}
