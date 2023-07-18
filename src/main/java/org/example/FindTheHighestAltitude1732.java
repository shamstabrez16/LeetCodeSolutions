package org.example;

public class FindTheHighestAltitude1732 {

    public static void main(String[] args) {
            int[] gain ={-4,-3,-2,-1,4,3,2};
            System.out.println(largestAltitude(gain));
    }
    public static int largestAltitude(int[] gain) {
        int currentHeight= 0;
        int max=currentHeight;
        for (int j : gain) {
            currentHeight = currentHeight + j;
            if (currentHeight > max) {
                max = currentHeight;
            }

        }
        return max;
    }
}
