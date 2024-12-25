package com.ysr.Exercises.Numbers;

public class NumberPalindromeCheck {
    public static void main(String[] args) {
        int n = 13031;
        System.out.println("Given number "+n+" is Palindrome number: "+ isPal(n));

    }
    public static boolean isPal(int n){
        int orig = n;
        int revNum = 0;
        int reminder;
        while(n>0){
            reminder = n%10;
            revNum =(revNum*10)+reminder;
            n=n/10;
        }
        return orig == revNum;
    }
}
