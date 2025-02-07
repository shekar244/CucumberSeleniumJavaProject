package com.ysr.Exercises.Collections;

import java.util.HashSet;
import java.util.Set;

public class HashSetExamples {
    public static void main(String[] args) {
        Set<String> name = new HashSet<>();
        name.add("shekar");
        name.add("reddy");
        name.add("laxmi");
        System.out.println(name);
        // cannot have duplicate values
        // no ordering


    }
}
