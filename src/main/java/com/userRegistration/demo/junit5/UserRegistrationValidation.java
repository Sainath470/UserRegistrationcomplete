package com.userRegistration.demo.junit5;
import java.util.regex.*;
import java.util.Scanner;

public class UserRegistrationValidation {
    String firstName;
    String lastName;
    String email;
    String phoneNumber;
    String passWord;

    public String getFirstName()
    {
        Scanner input=new Scanner(System.in);
        System.out.println("Please Enter your first Name");
        System.out.println("Rules: ");
        System.out.println("First letter should be Capital letter and minimum 3 characters");
        return input.next();
    }

    public String getLastName() {
        Scanner input2=new Scanner(System.in);
        System.out.println("Please Enter your Last Name");
        System.out.println("Rules: ");
        System.out.println("first letter should be Capital letter");
        System.out.println("Contain minimum 3 characters");
        return input2.next();
    }

    public String getUserPhoneNumber()
    {
        Scanner input4=new Scanner(System.in);
        System.out.println("Enter your valid Phone Number ");
        System.out.println("phone number must be in this format ex: 91 1234567890");
        return input4.next();
    }

    public String getUserEmail()
    {
        Scanner input3=new Scanner(System.in);
        System.out.println("Please Enter your valid email");
        return input3.next();
    }

    public String getPassword()
    {
        Scanner input4=new Scanner(System.in);
        System.out.println("Enter the Password");
        System.out.println("Rule: ");
        System.out.println("Minimum 8 characters");
        return input4.next();
    }

    //Method for input checking
    public void userValidator() {
        this.firstName = getFirstName();
        boolean fName = Pattern.matches("^[A-Z][a-z]{2,}", firstName);
        System.out.print("Your Entered first name is ");
        printingResult(fName);
        this.lastName = getLastName();
        boolean lName = Pattern.matches("^[A-Z][a-z]{2,}", lastName);
        System.out.print("Your Entered last name is ");
        printingResult(lName);
        this.email = getUserEmail();
        boolean emailId = Pattern.matches("^[\\D\\d.\\-+]+[@][a-z\\d]+\\.[a-z]{2,3}(\\.[a-z]{2,3})?", email);
        System.out.print("Your entered Email is ");
        printingResult(emailId);
        this.phoneNumber=getUserPhoneNumber();
        boolean pNumber=Pattern.matches("\\d{1,2}[\\s+]?\\d{1,10}", phoneNumber);
        System.out.print("Your entered Phone number is ");
        printingResult(pNumber);
        this.passWord=getPassword();
        boolean pass=Pattern.matches("^(?=.*[0-9])(?=.*[a-z])(?=.*[A-Z])(?=.*[!@#$%^&*()]).{8,}$",passWord);
        System.out.print("Your entered Password is ");
        printingResult(pass);
    }

    public static void printingResult(boolean check)
    {
        if(Boolean.TRUE.equals(check))
        {
            System.out.println("VALID");
        }
        else
        {
            System.out.println("INVALID");
        }
    }

    public static void main(String[] args) {
        System.out.println("Welcome to the User Registration");
        UserRegistrationValidation userinfo=new UserRegistrationValidation();
        userinfo.userValidator();
    }

}
