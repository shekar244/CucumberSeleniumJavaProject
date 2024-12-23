package com.ysr.Exercises.StringManupulations;
import java.util.Scanner;


public class ReverseStringWordsWithPosition {
    public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);
        System.out.println(" Enter a Sentence: ");
        String sentence = scanner.nextLine();
        String reversedSentence = reverseWords(sentence);
        System.out.println(" Reversed Sentence: "+reversedSentence);

    }
    public static String reverseWords(String sentence){
        String[] words = sentence.split("\\s+");
        String reversedSentence = "";
        for(int i=words.length-1; i>=0;i--){
            reversedSentence += words[i]+ " ";
        }
        return reversedSentence.trim();
    }

}
