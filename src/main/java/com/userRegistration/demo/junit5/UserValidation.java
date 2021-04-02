package com.userRegistration.demo.junit5;
import java.util.regex.Pattern;
public class UserValidation {

        public boolean firstNameValidation(String firstname) {
            return Pattern.matches("^[A-Z][a-z]{2,}", firstname);
        }


        public boolean lastNameValidation(String lastname) {
            return Pattern.matches("^[A-Z][a-z]{2,}", lastname);
        }


        public boolean mobileValidation(String mobile) {
            return Pattern.matches("\\d{1,2}[\\s+]?\\d{1,10}", mobile);
        }

    }


