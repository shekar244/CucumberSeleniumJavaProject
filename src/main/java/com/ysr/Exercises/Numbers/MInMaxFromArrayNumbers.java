package com.ysr.Exercises.Numbers;

public class MInMaxFromArrayNumbers {
    public static void main(String[] args){
        int [] array = {45,6,5,8,98};
        int max = array[0];
        int min = array[0];
        for(int num : array) {
//            System.out.println(num);
            if (max < num) {

                max = num;
            }
            else if (min > num) {
                min = num;
            }
        }
        System.out.println("Max number in array is : "+max);
        System.out.println("Min number in array is : "+min);
    }
}
