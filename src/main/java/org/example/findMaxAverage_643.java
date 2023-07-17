package org.example;

public class findMaxAverage_643 {
    public static void main(String[] args) {
       // int[] nums = {1, 12, -5, -6, 50, 3};
        int[] nums = {-1};
        int k = 1;
      System.out.println(findMaxAverage(nums,k));

    }
    public static double findMaxAverage(int[] nums, int k) {

        double sum =0;
         double highestAvg =0;
        for (int i = 0, j = 0; i < nums.length; i++) {
            if(i>=k){
                sum = sum+ nums[i]-nums[i-k];
                if(highestAvg<sum/k){
                    highestAvg = sum/k;
                }
            }else{
                sum = sum+ nums[i];
                    highestAvg = sum/k;
            }

        }
return highestAvg;
    }
}
