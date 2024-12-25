package com.ysr.Exercises.StringManupulations;

public class ReverseAString {
    public static void main(String[] args) {
        String word = "Shekar";
        String reverseWord ="";
        for(int i = word.length()-1; i>=0;i--){
            reverseWord += word.charAt(i);

        }
        System.out.println("Reversed String is : "+reverseWord);
    }
}
