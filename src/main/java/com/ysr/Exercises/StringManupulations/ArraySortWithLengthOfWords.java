package com.ysr.Exercises.StringManupulations;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.List;

public class ArraySortWithLengthOfWords {
    public static void main(String[] args) {
        //List<String> list = new ArrayList<String>();
        String[] names = {"apple", "gresys", "ab", "names"};
//        list.add("Byjuse");
//        list.add("cd");
//        list.add("anb");
//        list.add("cedf");
//        for(String element: list){
//        int length = element.length();
//
//       }
        Arrays.sort(names, Comparator.comparing(String::length));
        System.out.println(Arrays.toString(names));
    }
}
