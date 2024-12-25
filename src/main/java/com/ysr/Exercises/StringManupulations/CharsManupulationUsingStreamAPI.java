package com.ysr.Exercises.StringManupulations;

import java.util.Arrays;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class CharsManupulationUsingStreamAPI {
    public static void main(String[] args) {
        String name = "ShEkar reddy";
        char[] data = name.toCharArray();
        Stream<Character> characterStream = name.chars()
                .mapToObj(n->(char)n).sorted();
        characterStream.distinct().forEach(System.out::println);

        int vovelCount=0;
        int consonantsCount=0;
       for(char n:data)

        {
            n=Character.toLowerCase(n);
        if(n=='a'|| n=='e'|| n=='i'||n=='o'|| n=='u') {
            vovelCount++;
        }
        else
        {
            if(n>'a' && n<='z') {
                consonantsCount++;
            }
        }
        }
        System.out.println("Count of Vovel: "+vovelCount +" Count of Consonants: " +consonantsCount);
    }
}
