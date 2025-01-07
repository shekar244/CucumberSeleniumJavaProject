package com.ysr.Exercises.Others;

public class GenericsExamples {
    public static void main(String[] args) {
        Integer[] intArray = {1,2,3,4};
        Double[] doubleArray = {1.4,5.8,9.4};
        displayArray(intArray);
        displayArray(doubleArray);

    }
    public static <T> void displayArray(T[] array){
        for(T x : array)
        {
            System.out.print(x+ ", ");
        }
        System.out.println();
    }
}
