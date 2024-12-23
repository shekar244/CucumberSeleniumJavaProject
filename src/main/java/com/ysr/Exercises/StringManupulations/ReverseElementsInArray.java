package com.ysr.Exercises.StringManupulations;

import java.util.Arrays;

public class ReverseElementsInArray {
    public static void main(String[] args) {
        String[] array = {"avada","manage","voila"};
        reverseArray(array);
        System.out.println(Arrays.stream(array).toArray());
    }
    public static String[] reverseArray(String[] array){
        String[] reverse = {};
        int start=0;
        int end =array.length-1;
        while(start<end)
        {
            String temp = array[start];
            array[start] =array[end];
            array[end]= temp;
            start++;
            end--;

        }
        return reverse;
    }
}
