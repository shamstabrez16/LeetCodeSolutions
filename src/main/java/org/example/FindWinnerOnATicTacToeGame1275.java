package org.example;

import java.util.Arrays;

public class FindWinnerOnATicTacToeGame1275 {
    public static void main(String[] args)
    {
        int [][]  moves = {{2,1},{2,0},{2,2},{1,1},{0,0},{0,1},{0,2},{1,0},{1,2}};
        System.out.println(tictactoe(moves));
    }
    public static String tictactoe(int[][] moves) {
        int[][] check = new int[3][3];
        Arrays.fill(check[0],-1);
        Arrays.fill(check[1],-1);
        Arrays.fill(check[2],-1);
       if(moves.length<5) return  "Pending";
       int i =0;
        for (int[] move :moves) {
            check[move[0]][move[1]] = i%2;
            for (int j = 0; j < 3; j++) {
                if((check[j][0]==check[j][1])&&(check[j][0]==check[j][2])&&(check[j][0]!=-1)){
                    if(check[j][0]==1){
                        return "B";
                    } else if (check[j][0]==0) {
                        return "A";
                    }
                }
                if((check[0][j]==check[1][j])&&(check[0][j]==check[2][j])&&(check[0][j]!=-1)){
                    if(check[0][j]==1){
                        return "B";
                    } else if (check[0][j]==0) {
                        return "A";
                    }
                }
                if((check[0][0]==check[1][1])&&(check[0][0]==check[2][2])&&(check[0][0]!=-1)){
                    if(check[j][0]==1){
                        return "B";
                    } else if (check[j][0]==0) {
                        return "A";
                    }
                }
                if((check[0][2]==check[1][1])&&(check[0][2]==check[2][0])&&(check[0][2]!=-1)){
                    if(check[0][2]==1){
                        return "B";
                    } else if (check[j][0]==0) {
                        return "A";
                    }
                }
            }
            i++;
        }
        if(i==9){
            return "Draw";
        }
        return  "Pending";

    }
}
