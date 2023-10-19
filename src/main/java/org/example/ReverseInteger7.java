package org.example;

public class ReverseInteger7 {

    public static void main(String[] args) {
        System.out.println(reverse(1534236469));
    }

    public static int reverse(int x) {


        int total = 0;
        int sum = Math.abs(x);
        int i =String.valueOf(sum).length()-1;

        while (sum>0){
            int temp = sum%10;
            sum=sum/10;
            total = (int) (total + temp* Math.pow(10,i));
            i--;

        }
        int length = String.valueOf(Math.abs(x)).length();
        if(2147483647 == total){
            if(x>0&& length>=9){
                return 0;
            } else if (x<0&& length>9) {
                return 0;
            }
        }
        if(x>0){
            return total;
        }
        else{
            return -total;
        }


    }
}
