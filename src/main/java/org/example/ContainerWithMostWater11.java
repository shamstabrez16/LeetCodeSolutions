package org.example;

import java.util.Arrays;

public class ContainerWithMostWater11 {

    public static int maxArea(int[] height) {
        int max = 0;
//        for (int i = 0; i < height.length; i++) {
//            for (int j = i+1; j <height.length ; j++) {
//                int newHeight = (j-i)* Math.min(height[i],height[j]);
//                if(newHeight>max){
//                    max= newHeight;
//                }
//            }
//        }
//        return max;
        int i =0;
        int j = height.length-1;
        while(i<j){
            int newHeight = (j-i)* Math.min(height[i],height[j]);
            if(newHeight>max){
                max= newHeight;
            }
            if(height[i]<height[j]){
                i++;
            }
            else{
                j--;
            }
        }

        return max;

    }

    public static void main(String[] args) {
        int[]  height = {1,8,6,2,5,4,8,3,7};
        System.out.println(maxArea(height));
    }
}
