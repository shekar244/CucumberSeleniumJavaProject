package com.ysr.Exercises.StringManupulations;
import java.util.Scanner;


public class ReverseWordsStringWithSamePosition {
    public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);
        System.out.println(" Enter a Sentence: ");
        String sentence = scanner.nextLine();

        String reversedStringSentence = reverseWords(sentence);
        String reversedSentenceReversedWords = reverseWordsReversedSentence(sentence);
        System.out.println(" Reversed Words Sentence: "+reversedStringSentence);
        System.out.println(" Reversed Sentence with reversed words: "+reversedSentenceReversedWords);

    }
    public static String reverseWords(String sentence){
        String[] words = sentence.split("\\s+");
        String reversedStringSentence = "";
        for(int i=0; i<words.length;i++){
            words[i]= new StringBuilder(words[i]).reverse().toString();
            reversedStringSentence += words[i]+ " ";
        }
        return reversedStringSentence.trim();
    }
    public static String reverseWordsReversedSentence(String sentence){
        String[] words = sentence.split("\\s+");
        String reversedStringSentence = "";
        for(int i=(words.length)-1; i>=0;i--){
            words[i]= new StringBuilder(words[i]).reverse().toString();
            reversedStringSentence += words[i]+ " ";
        }
        return reversedStringSentence.trim();
    }

}
