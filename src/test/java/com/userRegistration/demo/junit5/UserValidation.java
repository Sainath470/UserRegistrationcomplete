package com.userRegistration.demo.junit5;

import org.junit.jupiter.api.Test;

import java.util.regex.Pattern;

import static org.junit.jupiter.api.Assertions.*;

public class UserValidation {

    @Test
    public boolean firstNameValidation(String firstname) {
        return Pattern.matches("^[A-Z][a-z]{2,}", firstname);
    }

    @Test
    public boolean lastNameValidation(String lastname) {
        return Pattern.matches("^[A-Z][a-z]{2,}", lastname);
    }

    @Test
    public boolean mobileValidation(String mobile) {
        return Pattern.matches("\\d{1,2}[\\s+]?\\d{1,10}", mobile);
    }
    @Test
    public boolean emailValidation1(String email)
    {
        return Pattern.matches("^[a-zA-Z]+([.\\-+]?\\d+)?[@][a-z\\d]+\\.[a-z]{2,3}([,])?(\\.[a-z]{2,3})?", email);
    }
}