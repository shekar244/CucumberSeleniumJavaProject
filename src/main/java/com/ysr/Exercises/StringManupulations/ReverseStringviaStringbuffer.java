package com.ysr.Exercises.StringManupulations;

public class ReverseStringviaStringbuffer {
    public static void main(String[] args) {
        reverseString("I am Good person 1254 9876");
    }
    public static void reverseString(String str){
        StringBuilder sb = new StringBuilder();
        String[] words = str.split(" ");
        System.out.println(words.length);
        for( int i=words.length-1;i>=0;i--){
            sb.append(words[i]).append(" ");
        }
        System.out.println(sb.toString().trim());
    }
}
