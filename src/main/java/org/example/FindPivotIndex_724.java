package org.example;

public class FindPivotIndex_724 {
    public static void main(String[] args) {
        int[] numbers = {1, 7, 3, 6, 5, 6};
        System.out.println(pivotIndex(numbers));
    }

    public static int pivotIndex(int[] nums) {

        int total = 0;
        for (int i = 0; i < nums.length; i++) {
            total = total + nums[i];
        }
        int tempTotal = 0;
        for (int i = 0; i < nums.length; i++) {
            if (tempTotal * 2 == total - nums[i]) {
                return i;
            } else tempTotal += nums[i];
        }
        return -1;
    }
}
