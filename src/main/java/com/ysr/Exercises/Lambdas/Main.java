package com.ysr.Exercises.Lambdas;

import java.util.Random;
import java.util.function.Function;
import java.util.function.IntBinaryOperator;

public class Main {
    public static void main(String[] args) {
        Greetings greeting = new HelloGreeting();
        greeting.sayHello();
        Greetings greetings2 = new Greetings() {
            @Override
            public void sayHello() {
                System.out.println("Hello World");
            }
        };
        greetings2.sayHello();
        Greetings greetings3 = ()-> System.out.println("hello World");
        greetings3.sayHello();
        IntBinaryOperator calculator = (int x, int y)->{
            Random random = new Random();
            int randomnumber = random.nextInt(50);
            return x+y+randomnumber;
        };
        System.out.println(calculator.applyAsInt(2,4));

    }
}
