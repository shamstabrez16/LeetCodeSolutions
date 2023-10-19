package org.example;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Set;

public class Jewels_and_Stones771 {
    public static int numJewelsInStones(String jewels, String stones) {
        int result = 0;
        for (int i = 0; i < stones.toCharArray().length; i++) {
            if(jewels.indexOf(stones.charAt(i)) !=-1){
                result++;
            }
        }
        return  result;

//        int result = 0;
//        Set<Character> jewelset =new HashSet<>();
//        for (int i = 0; i < jewels.toCharArray().length; i++) {
//            jewelset.add(jewels.charAt(i));
//        }
//        for (int i = 0; i < stones.toCharArray().length; i++) {
//            if(jewelset.contains(stones.charAt(i))){
//                result++;
//            }
//        }
//        return  result;
    }
    public static void main(String[] args)
    {
       String  jewels = "aA";
       String stones = "aAAbbbb";
        System.out.println(numJewelsInStones(jewels,stones));
    }
}
