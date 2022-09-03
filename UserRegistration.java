package Day19Regex;

import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class UserRegistration {
    static Scanner sc = new Scanner(System.in);
    public void validateUserName() {
        System.out.println("Enter UserName");
        String userName = sc.next();
        String regex = "^[A-Z]{1}[a-zA-z0-9]{2,}$";
        /**
         * First, the pattern is created using the Pattern.compile() method The
         * first parameter indicates which pattern is being searched for
         */
        Pattern p = Pattern.compile(regex);
        /**
         * The matcher() method is used to search for the pattern in a string.
         * It returns a Matcher object which contains information about the
         * search that was performed.
         */
        Matcher matcher = p.matcher(userName);
        /**
         * boolean data type is used for return op is true or false
         */
        boolean result = matcher.matches();
        /**
         * if else conditional statment is used if pattern match then print
         * valid username if not matched print invalid username
         */
        if (result) {
            System.out.println("Valid username");
        } else {
            System.out.println("Invalid username");
        }
    }
    public void validateLastName() {
        System.out.println("Enter Lastname");
        String lastName = sc.next();
        String regex = "^[A-Z]{1}[a-zA-z0-9]{2,}$";
        Pattern p = Pattern.compile(regex);
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
        String regex = "^[a-zA-Z0-9]+([+_.-][a-zA-Z0-9]+)*[@][a-zA-Z0-9]+[.][a-zA-Z]{2,4}([.][a-zA-Z]{2,4})?";
        Pattern p = Pattern.compile(regex);
        Matcher matcher = p.matcher(eMail);
        boolean result = matcher.matches();
        if (result) {
            System.out.println("Valid Email");
        } else {
            System.out.println("Invalid Email");
        }
    }
    public static void main(String[] args) {
        /**
         * create object for UserRegistration class object name is registration.
         */
        UserRegistration registration = new UserRegistration();
        /**
         * while loop is used
         */
        while (true) {
            /**
             * user input choice for checking Multiple validation
             */
            System.out.println(
                    "Enter choice to validate\n" + "Enter 1 for UserName\n"
                            + "Enter 2 for Lastname\n" + "Enter 3 for Email\n");// uc1

            int choice = sc.nextInt();
            /**
             * using switch case for choosing option and print output calling
             * wise.
             *
             */
            switch (choice) {
                case 1 :
                    registration.validateUserName();
                    break;
                case 2 :
                    registration.validateLastName();
                    break;
                case 3 :
                    registration.validateEmail();
                    break;
                default :
                    System.out.println("Invalid choice");
                    System.exit(0);
            }
        }
    }
}