package com.ysr;

public class App 
{
    public static void main( String[] args )
    {
    String text = "mom";
            StringBuilder reverstext = new StringBuilder(text);
            reverstext.reverse();
            System.out.println(reverstext);

                String[] arr = { "java", "python", "C", "C++", "java", "python" };

                for (int i = 0; i < arr.length; i++) {

                    for (int j = i + 1; j < arr.length; j++) {

                        if (arr[i].equals(arr[j])) {
                            System.out.println("Found duplicate element " + arr[i]);
                        }
                    }

                }





    }
}
