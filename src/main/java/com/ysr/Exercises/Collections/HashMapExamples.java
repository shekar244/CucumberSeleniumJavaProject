package com.ysr.Exercises.Collections;
import java.util.HashMap;
public class HashMapExamples {
    public static void main(String[] args) {
        HashMap<String,String> countries = new HashMap<String,String>();
        countries.put("usa", "DC");
        countries.put("india", "delhi");
        countries.put("russia", "moscco");
                System.out.println(countries);
                for(String i : countries.keySet())
                {
                    System.out.print(i+"\t"+"= ");
                    System.out.println(countries.get(i));
                }
    }
}
