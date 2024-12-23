package com.ysr.Exercises.StringManupulations;

import java.util.Locale;

public class VovelConstCountInString {
    public static void main(String[] args) {
        String s = "Shekar 123z";
        s= s.toLowerCase(Locale.ROOT);
        int cVovel = 0;
        int cConst = 0;
        for(int i=0; i<s.length();i++){
            if(s.charAt(i)=='a'|| s.charAt(i)=='e'||s.charAt(i)=='i'||s.charAt(i)=='o'){
                cVovel++;
            }
            else if (s.charAt(i)>='a' && s.charAt(i)<='z')
            {
                cConst++;
            }
        }
        System.out.println("Count of Vovel :"+ cVovel);
        System.out.println("Count of Consonants :"+ cConst);

    }
}
