package org.example;

public class LemonadeChange860 {
    public static void main(String[] args) {
        int[] bills = {5, 5, 20, 5, 5, 10, 5, 10, 5, 20};
        System.out.println(lemonadeChange(bills));
    }

    public static boolean lemonadeChange(int[] bills) {
        int[] remainBills = {0, 0, 0};
        for (int bill : bills) {
            if (bill == 5) {
                remainBills[0]++;
            } else if (bill == 10) {
                if (remainBills[0] > 0) {
                    remainBills[0]--;
                } else {
                    return false;
                }
                remainBills[1]++;
            } else {
                if (remainBills[1] >= 1) {
                    remainBills[1]--;
                    if (remainBills[0] > 0) {
                        remainBills[0]--;
                    } else {
                        return false;
                    }
                    remainBills[2]++;
                } else if (remainBills[0] >= 3) {
                    remainBills[0]--;
                    remainBills[0]--;
                    remainBills[0]--;
                    remainBills[2]++;
                } else {
                    return false;
                }
            }
        }
        return remainBills[0]>=0&&remainBills[1]>=0&&remainBills[2]>=0;
}
}
