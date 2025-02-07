package com.ysr.Exercises.StreamApiTopics;

import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class MovingZerostoEndofList {
    public static void main(String[] args) {
        List<Integer> numbers = List.of(1,0,-3,5,5,8,0,4,2,0,-4);
        List<Integer> sortedNumbers = Stream.concat(numbers.stream().filter(n->n!=0),numbers.stream().filter(n->n==0))
                .collect(Collectors.toList());
        System.out.println(sortedNumbers);

    }
}
