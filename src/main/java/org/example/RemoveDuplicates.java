package org.example;

public class RemoveDuplicates {

    public static void main(String[] args) {
        int[] nums = {0,0,1,1,1,1,2,3,3};
        System.out.println(removeDuplicates(nums));
    }
    public static int removeDuplicates(int[] nums) {
        int i = 0;
        int val = 0;
        for (int j = 0; j < nums.length; j++) {
            if (nums[j] == 0 && i == 0) {
                nums[i] = val;
                i++;
            } else if (nums[j] != val) {
                val = nums[j];
                nums[i] = val;
                i++;
            }

        }
        return i;
    }
}
