package com.ysr.Exercises.StringManupulations;

public class StringReverse {
    public static void main(String[] args) {
        String input = "i ha be   an    ag     67eher";
        String output = reversePreserveSpaces(input);
        System.out.println("Input:  " + input);
        System.out.println("Output: " + output);
    }

    public static String reversePreserveSpaces(String str) {
        // Remove all spaces from the string and store it in a StringBuilder for reversal
        StringBuilder noSpaceStr = new StringBuilder();
        for (char ch : str.toCharArray()) {
            if (ch != ' ') {
                noSpaceStr.append(ch);
            }
        }

        // Reverse the non-space string
        String reversedNoSpaceStr = noSpaceStr.reverse().toString();

        // Rebuild the string with spaces in their original positions
        StringBuilder result = new StringBuilder();
        int j = 0; // Index for characters of reversedNoSpaceStr
        for (int i = 0; i < str.length(); i++) {
            if (str.charAt(i) == ' ') {
                result.append(' ');
            } else {
                result.append(reversedNoSpaceStr.charAt(j++));
            }
        }

        return result.toString();
    }
}
