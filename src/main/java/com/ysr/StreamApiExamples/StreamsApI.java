package com.ysr.StreamApiExamples;

import io.cucumber.java.sl.In;

import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Stream;

public class StreamsApI {
    public static void main(String[] args) {
        List<Integer> nums = Arrays.asList(4,7,9);
//        Stream<Integer> data =nums.stream();
//       Stream<Integer> appdata= data.map(n->n*2);
//        appdata.forEach(n-> System.out.println(n));
        nums.stream()
                .map(n->n*2)
                .forEach(n-> System.out.println(n));
        nums.stream()
                .filter(n-> n%2==1)
                .sorted()
                .map(n->n*2)
                .forEach(System.out::println);


    }
}
