package org.example;

    /*
    Given an integer x, return true if x is a
palindrome
, and false otherwise.



Example 1:

Input: x = 121
Output: true
Explanation: 121 reads as 121 from left to right and from right to left.
Example 2:

Input: x = -121
Output: false
Explanation: From left to right, it reads -121. From right to left, it becomes 121-. Therefore it is not a palindrome.
Example 3:

Input: x = 10
Output: false
Explanation: Reads 01 from right to left. Therefore it is not a palindrome.


Constraints:

-231 <= x <= 231 - 1


Follow up: Could you solve it without converting the integer to a string?
     */
    public class PalindromeNumber_9 {
    public boolean isPalindrome(int x) {

        int number = 0;
        int actual =x;
         int reminder =0;
        for (int i = 0; x >0 ; i++) {
            reminder= x%10;
            x=x/10;
            number = (number*10)+reminder;
        }
       if(actual==number){
           return true;
       }
        return false;

    }

}
