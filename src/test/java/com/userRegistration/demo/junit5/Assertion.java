package com.userRegistration.demo.junit5;
import org.junit.Assert;
import org.junit.Test;

public class Assertion {

        UserValidation test = new UserValidation();

        @Test
        public void givenFirstname_When_Correct_returnTrue() {
            boolean first_name = test.firstNameValidation("Venkata");
            Assert.assertTrue(first_name);
        }

        @Test
        public void givenFirstname_When_NotCorrect_returnFalse() {
            boolean first_name = test.firstNameValidation("venkata");
            Assert.assertFalse(first_name);
        }

        @Test
        public void givenLastname_When_Correct_returnTrue() {
            boolean last_name = test.lastNameValidation("Sainath");
            Assert.assertTrue(last_name);
        }

        @Test
        public void givenLastname_When_NotCorrect_returnFalse() {
            boolean last_name = test.lastNameValidation("sa inath");
            Assert.assertFalse(last_name);
        }

        @Test
        public void givenPhoneNumber_When_Correct_returnTrue() {
            boolean phone_number = test.mobileValidation("91 9991116669");
            Assert.assertTrue(phone_number);
        }

        @Test
        public void givenPhoneNumber_When_NotCorrect_returnFalse() {
            boolean phone_number = test.mobileValidation("919s991116669");
            Assert.assertFalse(phone_number);


        }
    }