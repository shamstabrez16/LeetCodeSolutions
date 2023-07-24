package org.example;

public class RobotReturn2Origin657 {
    public static void main(String[] args) {
        String moves = "LRLUD";
        System.out.println(judgeCircle(moves));
    }

    public static boolean judgeCircle(String moves) {
        int[] isOrigin = {0,0};
        for (char c:moves.toCharArray()
             ) {
            switch (c) {
                case 'U' ->
                    isOrigin[0]++;

                case 'D' ->
                    isOrigin[0]--;

                case 'L' ->
                    isOrigin[1]++;

                case 'R' ->
                    isOrigin[1]--;
            }

        }
        return  isOrigin[0]==0 && isOrigin[1]==0;
    }
}
