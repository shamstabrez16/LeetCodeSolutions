package org.example;

public class CheckIfItIsAStraightLine1232 {
    public static void main(String[] args) {
        int[][] coordinates = {{0,0}, {0,5}, {5,5},{5,0}};
        System.out.println(checkStraightLine(coordinates));
    }

    public static boolean checkStraightLine(int[][] coordinates) {
        float x_diff = (float)coordinates[coordinates.length - 2][0] -(float)coordinates[coordinates.length - 1][0] ;
        float y_diff = (float)coordinates[coordinates.length - 2][1] -(float)coordinates[coordinates.length - 1][1] ;
        float initialSlope= (x_diff!=0)? y_diff / x_diff:0;
        int isVerticalLine = 0;
        for (int i = coordinates.length - 1; i > 0; i--) {
            float slope=0;

            if((float)coordinates[i][0] - (float)coordinates[i - 1][0]==0){
                if(isVerticalLine==1){
                    return false;
                }
               if(initialSlope!=slope){
                   return false;
               }
            }
            else{
                isVerticalLine= 1;
                float y2 = (float) coordinates[i][1];
                float y1 = (float) coordinates[i - 1][1];
                float x2 = (float)coordinates[i][0];
                float x1 = (float)coordinates[i - 1][0];
                slope =  (y2-y1)/(x2-x1);
                if(initialSlope!=slope){
                    return false;
                }
            }
        }
        return true;
    }
}
