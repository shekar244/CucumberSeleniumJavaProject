package com.ysr.Exercises;

import java.util.*;
import java.lang.*;

class RepeatedCharAndPosition {
    public static void repeatedChar(String str) {
        Map<Character, Integer> seenChar = new HashMap<>();
        for (int i = 0; i < str.length(); i++) {
            char c = str.charAt(i);
            if (seenChar.containsKey(c)) {
                System.out.println("First Repeated char is : " + c);
                System.out.println("At position: " + (seenChar.get(c) + 1));
                return;
            } else {
                seenChar.put(c, i);
            }

        }
        System.out.println("char not found");
    }

    public static void main(String[] args) throws java.lang.Exception {
        // your code goes here

        String a = "aestint";
        repeatedChar(a);

        // String immutable cannot be changed once assigned //
        String my = new String("Name");
        my.concat("father");

        System.out.println(my);
        // * String buffer mutable can be appended and modified.
        // A string buffer is a mutable sequence of characters in Java that can be modified and is thread-safe.
        // It's similar to a string, but its length and contents can be changed using specific method calls
        StringBuffer SB = new StringBuffer("name");
        SB.append("ttt");
        SB.insert(1,"Reddy");
        System.out.println(SB);

    }


}
