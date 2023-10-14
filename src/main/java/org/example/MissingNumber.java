package org.example;

import java.util.HashSet;
import java.util.Set;

public class MissingNumber {

    public static int missingNumber(int[] nums) {
        int n = nums.length;
        int sum = ( n * (n +1))/2;
        for(int i=0; i< nums.length; i++){
           sum = sum - nums[i];
        }
        return  sum;


//        Set<Integer> set = new HashSet<>();
//        for(int i=0; i< nums.length; i++){
//           set.add(nums[i]);
//        }
//        for(int i=0; i<= nums.length; i++){
//            if(!set.contains(i)){
//                return i;
//            }
//        }
//        return -1;
    }

    public static void main(String[] args) {
        int[] nums = {9,6,4,2,3,5,7,0,1};
        System.out.println(missingNumber(nums));
    }
}
