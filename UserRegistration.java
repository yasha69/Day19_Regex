package Day19Regex;


import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class UserRegistration {
    static Scanner sc=new Scanner(System.in);
    public void validateUsername() {
        System.out.println("Enter UserName");
        String userName=sc.next();
        String regex = "^[A-Z]{1}[a-zA-z0-9]{2,}$";
        /**
         * First, the pattern is created using the Pattern.compile() method
         * The first parameter indicates which pattern is being searched for
         */
        Pattern p = Pattern.compile(regex);
        /**
         * The matcher() method is used to search for the pattern in a string.
         * It returns a Matcher object which contains information about the search that was performed.
         */
        Matcher matcher = p.matcher(userName);
        /**
         * boolean data type is used for return output is true or false
         */
        boolean result = matcher.matches();
        /**
         *  if else conditional statement is used
         *  if pattern match then print  valid username if not matched print invalid username
         */
        if(result){
            System.out.println("Valid username");
        }
        else {
            System.out.println("Invalid username");
        }
    }
    public static void main(String[] args) {
        /**
         * create object for UserRegistration class
         * object name is registration.
         */
        UserRegistration registration=new UserRegistration();
        /**
         * while loop is used
         */
        while(true) {
            /**
             * user input choice for checking Multiple validation
             */
            System.out.println("Enter choice.............\n " +"1)UserName\n");

            int choice=sc.nextInt();
            /**
             * using switch case for choosing option and print output calling wise.
             *
             */
            switch(choice) {
                case 1:
                    registration.validateUsername();
                    break;
                default:
                    System.out.println("Invalid choice");
                    System.exit(0);
            }
        }
    }
}