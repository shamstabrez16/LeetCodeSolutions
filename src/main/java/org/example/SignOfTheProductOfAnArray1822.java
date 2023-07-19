package org.example;

public class SignOfTheProductOfAnArray1822 {
    public static int arraySign(int[] nums) {
        int count=0;
        for (Integer n:nums) {
            if(n==0){
                return 0;
            } else if (n<0) {
                count++;
            }
        }
        if(count%2==0){
            return 1;
        }
        else return -1;
    }

    public static void main(String[] args) {
        int [] nums = {-1,-2,-3,-4,3,2,1};
        System.out.println(arraySign(nums));
    }
}
