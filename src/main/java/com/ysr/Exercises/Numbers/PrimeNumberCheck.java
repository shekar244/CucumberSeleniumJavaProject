package com.ysr.Exercises.Numbers;

public class PrimeNumberCheck {
    public static void main(String[] args) {
        int n = 8;
        System.out.println("Given number "+n+ " is prime: "+checkPrime(n));


    }
    public static boolean checkPrime(int n) {
        for (int i = 2; i < n / 2; i++) {
            if (n % i == 0) {
                return false;
            }
        }
        return true;
    }

}
