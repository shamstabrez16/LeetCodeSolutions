package org.example;

public class RemoveDuplicates2 {

    public static void main(String[] args) {
        int[] nums = {0,0,1,1,1,1,2,3,3};
        System.out.println(removeDuplicates(nums));
    }
    public static int removeDuplicates(int[] nums) {
        int j = 1;
        int count = 0;
        for(int i = 1; i < nums.length; i++){

            if(nums[i]!= nums[i-1]){
                nums[j]= nums[i];
                j++;
                count=1;
            }
            else if(nums[i]== nums[i-1]){
                count++;
                if(count <=2){
                    nums[j]= nums[i];
                    j++;
                    count++;
                }
            }
            else{
                count =0;
            }


        }
        return j;

    }
}
