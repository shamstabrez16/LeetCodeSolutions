package org.example;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Objects;

public class MonotonicArray896 {
    public static void main(String[] args) {

        int[] nums = {1,2,2,4};
        System.out.println(isMonotonic(nums));
    }

    public static boolean isMonotonic(int[] nums) {

        boolean increasing = true;
        boolean decreasing = true;

        for (int i = 1; i < nums.length; i++) {
            if (nums[i - 1] < nums[i]) {
                decreasing = false;
            } else if (nums[i - 1] > nums[i]) {
                increasing = false;
            }

            // Optimization: If both increasing and decreasing are false, we can return false.
            if (!increasing && !decreasing) {
                return false;
            }
        }

        return true;


//        String flag = "";
//        for (int i = 1; i < nums.length - 1; i++) {
//            if (nums[i - 1] != nums[i] || nums[i] != nums[i + 1]) {
//                if (nums[i - 1] < nums[i]) {
//                    if ((!flag.isEmpty()) && flag.equals("decrement")) {
//                        return false;
//                    }
//                    flag = "increment";
//                    if (nums[i] > nums[i + 1]) {
//                        return false;
//                    }
//                } else if (nums[i - 1] > nums[i]) {
//                    if ((!flag.isEmpty()) && flag.equals("increment")) {
//                        return false;
//                    }
//                    flag = "decrement";
//
//                    if (nums[i] < nums[i + 1]) {
//                        return false;
//                    }
//                }
//            }
//
//        }
//        return true;
    }
}
