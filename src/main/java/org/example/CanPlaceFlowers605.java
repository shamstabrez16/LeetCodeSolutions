package org.example;

public class CanPlaceFlowers605 {

    public static void main(String[] args) {
      // int [] flowerbed = {1,0,0,0,1};
        int [] flowerbed =  {1,0,0,0,1,0,0};
       int n = 2;
      System.out.println(canPlaceFlowers(flowerbed,n));
    }

    public static  boolean canPlaceFlowers(int[] flowerbed, int n) {
        if(flowerbed.length==1){
           if(flowerbed[0]==0){
               n--;
           }
        }
        else{
            for (int i=0;i<flowerbed.length;i++ ) {
                if(flowerbed[i]==0&& i>0 && i<flowerbed.length-1){
                    if(flowerbed[i-1]!=1 && flowerbed[i+1]!=1){
                        flowerbed[i]=1;
                        n--;
                    }
                } else if (flowerbed[i]==0 && i==0) {
                    if(flowerbed[i+1]!=1){
                        flowerbed[i]=1;
                        n--;
                    }
                }
                else if (flowerbed[i]==0 && i==flowerbed.length-1) {
                    if(flowerbed[i-1]!=1){
                        flowerbed[i]=1;
                        n--;
                    }
                }

            }
        }
        return  n<=0;
    }
}
