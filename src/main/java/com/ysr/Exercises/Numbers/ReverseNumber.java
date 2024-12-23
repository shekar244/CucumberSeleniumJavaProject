package com.ysr.Exercises.Numbers;

public class ReverseNumber {
    public static void main(String[] args) {
        int n = 7894;
        int reminder;
        int revNumber=0;
        while(n>0){
            reminder = n%10;
            revNumber =(revNumber*10)+reminder;
            n=n/10;
        }
        System.out.println(revNumber);
    }
}
