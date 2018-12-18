package com.izdebski.SpringBootCustomSecurityWithDatabase.password;

import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;

public class BCryptPasswordEncoderTest {

    public static void main(String[] args) {
        BCryptPasswordEncoder bCryptPasswordEncoder = new BCryptPasswordEncoder();
        System.out.println(bCryptPasswordEncoder.encode("p@123"));
        System.out.println(bCryptPasswordEncoder.encode("s@123"));
    }
}