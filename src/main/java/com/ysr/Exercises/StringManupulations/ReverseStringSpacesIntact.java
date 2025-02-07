package com.ysr.Exercises.StringManupulations;

public class ReverseStringSpacesIntact {
    public static void main(String[] args) {
        String input = "Hello World   abs";
        char[] chars = input.toCharArray();
        char[] onlyChars = new char[input.length()];
        int index = input.length()-1;
        int noOfSpaces = 0;
        for (char c : chars){
            if (c != ' ')
            {
               onlyChars[index--]=c;

            }
            else {
                noOfSpaces++;
            }
        }


       int index1 =noOfSpaces;
        for(int i=0;i<chars.length;i++)
        {
            if(chars[i]!=' '){
                chars[i] =onlyChars[index1++];
            }
        }
        System.out.println(input);
        System.out.println( new String(chars));
    }
}
