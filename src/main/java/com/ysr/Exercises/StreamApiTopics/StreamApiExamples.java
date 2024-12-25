package com.ysr.Exercises.StreamApiTopics;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Stream;

public class StreamApiExamples {
    public static void main(String[] args) {
        List<Integer> nums = Arrays.asList(12,15,45,65,1,8,7);
        for (Integer num : nums) {
            System.out.println(num);
        }
        Stream<Integer> data = nums.stream();
        data.map(n-> n*2)
                .forEach(n-> System.out.println(n));

        System.out.println(" Filtered data: ");
        Stream<Integer> data1 = nums.stream();
        data1.filter(n->n%2==0).forEach(n-> System.out.println(n));
    }
}
