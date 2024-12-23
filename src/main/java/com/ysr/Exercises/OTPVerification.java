package com.ysr.Exercises;

import org.jboss.aerogear.security.otp.Totp;

public class OTPVerification {
    public static void main(String[] args) {
        Totp topt = new Totp("ttsh y4fw p2ac gkvx u4qe ejal jysf 4ppn");
        String currentotp = topt.now();
        System.out.println(currentotp);
    }
}
