package com.ysr.StreamApiExamples;

import io.cucumber.java.sl.In;

import java.util.Arrays;
import java.util.List;

public class ForEachExamples {
    public static void main(String[] args) {
        List<Integer> nums = Arrays.asList(5,4,9,0,23,4);
        for(int i =0; i<6;i++)
        {
            System.out.println(nums.get(i));
        }
        System.out.println(" Using for loop: ");
        for(int n : nums)
        {
            System.out.println(n);
        }
        nums.forEach(System.out::println);
    }
}
