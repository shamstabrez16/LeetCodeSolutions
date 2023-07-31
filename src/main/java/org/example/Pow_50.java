package org.example;

public class Pow_50 {
    public static void main(String[] args) {
              myPow(2.00000,-2147483648);

    }
    public static String decimalToBinary(int n){
        StringBuilder s = new StringBuilder();
        int k=1;
        while (n!=0){
            s = ((n % 2) == 0) ? s.append(0) : s.append(k);
            s.append(",");
            k=k*2;
            n=n/2;
        }
        System.out.println(s);
        return s.toString();
    }
    public static double myPow(double x, int n) {
        if (n == 0) {
            return 1;
        }

        long exp = n;
        if (exp < 0) {
            x = 1 / x;
            exp = -exp;
        }

        double result = 1;
        while (exp > 0) {
            if ((exp & 1) == 1) {
                result *= x;
            }
            x *= x;
            exp >>= 1;
        }

        return result;


    }
}
