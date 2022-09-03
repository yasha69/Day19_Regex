package Day19Regex;

import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class UserRegistration {
    static Scanner sc = new Scanner(System.in);

    public void validateUserName() {
        System.out.println("Enter UserName");
        String userName = sc.next();
        Pattern p = Pattern.compile("^[A-Z]{1}[a-zA-z0-9]{2,}$");
        Matcher matcher = p.matcher(userName);
        boolean result = matcher.matches();
        if (result) {
            System.out.println("Valid username");
        } else {
            System.out.println("Invalid username");
        }
    }

    public void validateLastName() {
        System.out.println("Enter Lastname");
        String lastName = sc.next();
        Pattern p = Pattern.compile("^[A-Z]{1}[a-zA-z0-9]{2,}$");
        Matcher matcher = p.matcher(lastName);
        boolean result = matcher.matches();
        if (result) {
            System.out.println("Valid lastname");
        } else {
            System.out.println("Invalid lastname");
        }
    }

    public void validateEmail() {
        System.out.println("Enter Email");
        String eMail = sc.next();
        Pattern p = Pattern.compile("^[a-zA-Z0-9]+([+_.-][a-zA-Z0-9]+)*[@][a-zA-Z0-9]+[.][a-zA-Z]{2,4}([.][a-zA-Z]{2,4})?");
        Matcher matcher = p.matcher(eMail);
        boolean result = matcher.matches();
        if (result) {
            System.out.println("Valid Email");
        } else {
            System.out.println("Invalid Email");
        }
    }

    public void validPhoneNo() {
        Scanner sc1 = new Scanner(System.in);
        System.out.println("Enter Phone no with country code");
        String phoneNo = sc1.next();
        Pattern p = Pattern.compile("^[0-9]{1,3}\\s[0-9]{10}$");
        Matcher matcher = p.matcher(phoneNo);
        boolean result1 = matcher.matches();
        if (result1) {
            System.out.println("Valid PhoneNo");
        } else {
            System.out.println("Invalid phoneNo");
        }
    }

    public void validPassword() {
        Scanner sc2= new Scanner(System.in);
        System.out.println("Enter password");
        String password = sc2.next();
        Pattern p = Pattern.compile("^[A-Z]{1}+[a-zA-z1-9]{5,}[@$#^]{1}[1-9]{1}$");
        Matcher matcher = p.matcher(password);
        boolean result = matcher.matches();
        if (result) {
            System.out.println("Valid Password");
        } else {
            System.out.println("Invalid Password");
        }
    }
    private void emailValidation() {
        System.out.println("Enter Email");
        String email=sc.next();
        Pattern p = Pattern.compile("^[a-zA-Z0-9]+([+_.-][a-zA-Z0-9]+)*[@][a-zA-Z0-9]+[.][a-zA-Z]{2,4}([.][a-zA-Z]{2,4})?");
        Matcher matcher = p.matcher(email);
        boolean result = matcher.matches();
        if(result){
            System.out.println("Valid Email Address");
        }
        else {
            System.out.println("Invalid Email Address");
        }
    }
    public static void main(String[] args) {
        UserRegistration registration = new UserRegistration();
        while (true) {
            System.out.println(
                    "Enter choice to validate\n" + "Enter 1 for UserName\n"
                            + "Enter 2 for Lastname\n" + "Enter 3 for Email\n" + "Enter 4 for phone number\n" + "Enter 5 for password\n" + "Enter 6 for email validation");
            int choice = sc.nextInt();
            switch (choice) {
                case 1:
                    registration.validateUserName();
                    break;
                case 2:
                    registration.validateLastName();
                    break;
                case 3:
                    registration.validateEmail();
                    break;
                case 4:
                    registration.validPhoneNo();
                    break;
                case 5:
                    registration.validPassword();
                    break;
                case 6:
                    registration.emailValidation();
                    break;
                default:
                    System.out.println("Invalid choice");
                    System.exit(0);
            }
        }
    }
}