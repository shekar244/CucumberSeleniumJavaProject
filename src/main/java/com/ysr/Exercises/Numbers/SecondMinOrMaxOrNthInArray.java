package com.ysr.Exercises.Numbers;

import io.cucumber.java.be.I;

public class SecondMinOrMaxOrNthInArray {
    public static void main(String[] args){
        int [] array = {89, 4,67,8, 9, 78};
        secMaxandMinofArray(array);
//        secMinofArray(array);
//        System.out.println("Second Max value of Array is : "+secMax);
//        System.out.println("Second Min value of Array is : "+ secMin);
    }
    public static void secMaxandMinofArray(int [] array){
        int secMaxNumber =Integer.MIN_VALUE;
        int secMinNumber= Integer.MAX_VALUE;
        int max = array[0];
        int min = array[0];
        int maxIndex =0;
        int minIndex =0;
        for(int i=0;i<array.length;i++)
        {
            if(max<array[i])
            {
                max = array[i];
                maxIndex =i;
            }else if (min>array[i]){
                min = array[i];
                minIndex =i;
            }
        }
        for(int j=0;j<array.length;j++)
        {
            if(j!=maxIndex && secMaxNumber<array[j]){
                secMaxNumber=array[j];
        }else if (j!=maxIndex && secMinNumber>array[j])
            {
                secMinNumber =array[j];
            }
        }
        System.out.println(" Second Max number in array : " +secMaxNumber);
        System.out.println(" Second min number in array : " +secMinNumber);

    }

}
