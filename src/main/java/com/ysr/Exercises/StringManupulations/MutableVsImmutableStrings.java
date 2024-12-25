package com.ysr.Exercises.StringManupulations;

import java.util.stream.IntStream;

public class MutableVsImmutableStrings {
    public static void main(String[] args) {
        String s = "Shekar";
        s.concat("+Mama");
        String ns = s.concat("+Mana");
        StringBuffer sb = new StringBuffer("Reddy");
        sb.append("+Yedma");
        System.out.println(sb);
        System.out.println(s +" : " +ns);
        System.out.println(" IntStream demonstration: ");
        IntStream is = sb.chars();
        System.out.println(is.count());
        ns.chars()
                .forEach(c-> System.out.print((char) c +" "));
    }
}
