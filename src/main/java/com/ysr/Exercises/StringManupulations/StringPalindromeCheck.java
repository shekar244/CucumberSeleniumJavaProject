package com.ysr.Exercises.StringManupulations;

public class StringPalindromeCheck {
    public static void main(String[] args) {
        String s = "7 civic 7";
        System.out.println("Given String "+ s +" is palindrome: "+palindromeCheck(s));
    }
    public static String palindromeCheck(String s){
        int start =0;
        int end =s.length()-1;
        while(start<end){
            if(s.charAt(start)!=s.charAt(end)){
                return "No";

            }
            start++;
            end--;
        }
        return "Yes";
    }
}
