package com.ysr.Exercises.StringManupulations;

public class CountCharsUsingStreamApi {
    public static void main(String[] args) {
        String name = "shekar Reddy$";
//        name  = name.replaceAll(" ", "");
        long vovelCount =0;
        long constCount =0;
        vovelCount = name.chars()
                        .filter(ch->
                                ('a'==ch||'e'==ch||'i'==ch||'o'==ch || 'u'==ch||
                                 'A'==ch||'E'==ch||'I'==ch||'O'==ch || 'U'==ch)
                )
                .count();
        constCount = name.chars()
                .filter(ch-> (ch>='a'&& ch<='z')||(ch>='A'&& ch<='Z'))
                .filter(ch->
                        ('a'!=ch&&'e'!=ch&&'i'!=ch && 'o'!=ch && 'u'!=ch&&
                                'A'!=ch&&'E'!=ch&&'I'!=ch&&'O'!=ch && 'U'!=ch)
                )
                .count();
        System.out.println("vovel Count : "+vovelCount);
        System.out.println("Consonants Count : "+constCount);
    }
}
