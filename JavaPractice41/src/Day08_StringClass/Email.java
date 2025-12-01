package Day08_StringClass;

import java.util.Scanner;

public class Email {
    public static void main(String[] args) {
        /*Email1 Task: Create a class called Email1. Assume that the email address is constructed by a person's first name followed
by an underscore and last name. Write a program that can swap the first name with the last name in the email (separated by an underscore). If the email doesn't contain an underscore, print the given input email.
        Example:
              Input:
                 mike_tyson@gmail.com
              Output:
                  tyson_mike@gmail.com
         */
        Scanner input = new Scanner(System.in);
        System.out.println("Enter email address please:");
        String email = input.nextLine();
        input.close();
        int underscore = email.indexOf('_');

        if (underscore>0){
            int at = email.indexOf('@');
            String firstName = email.substring(0,underscore);
            String lastName = email.substring(underscore + 1,at);

            System.out.println(lastName + "_" + firstName +email.substring(at));
        }else{
            System.out.println(email);
        }




    }
}
