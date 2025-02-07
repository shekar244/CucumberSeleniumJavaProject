package com.ysr.Exercises.StreamApiTopics;

import java.util.ArrayList;
import java.util.List;

public class StreamApiLists {
    public static void main(String[] args) {
        String[] array = new String[20];
        //array[0]="Shekar";
        int len = array.length;
        System.out.println(len);
        StringBuffer sb = new StringBuffer("Shekar ");
        sb.append("Reddy");
        System.out.println(sb);
        List<String> ls = new ArrayList<>();
        ls.add("laxmi");
        ls.add("Maduri");
        System.out.println(ls);
        ls.forEach(s -> System.out.println(s));




    }
}
