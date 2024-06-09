package Leetcode_Problems;

class Palindrome {
    public boolean isPalindrome(int x) {
        int original = x;
        int temp = 0;
        if(x < 0){
            return false;
        }
        while(x > 0){
            int rem = x % 10;
            temp = temp * 10 + rem;
            x = x/10;
        }
        return original == temp;
    }

}