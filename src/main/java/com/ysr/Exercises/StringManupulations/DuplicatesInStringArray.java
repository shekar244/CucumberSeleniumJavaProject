package com.ysr.Exercises.StringManupulations;
import java.util.HashSet;
import java.util.Set;

public class DuplicatesInStringArray{
    public static void main(String[] args) {
        String[] strArray = {"apple", "banana", "apple","prance", "orange","banana"};
        Set<String> duplicate = findDupes(strArray);
        System.out.println("Duplicate elements: "+ duplicate);
    }
    public static Set<String> findDupes(String[] array){
        Set<String> seen = new HashSet<>();
        Set<String> duplicates = new HashSet<>();
        for(String str : array){
            if(!seen.add(str)){
                duplicates.add(str);
            }
        }
        return duplicates;
    }
}
