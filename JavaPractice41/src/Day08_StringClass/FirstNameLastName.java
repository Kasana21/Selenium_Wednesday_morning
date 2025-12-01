package Day08_StringClass;

import java.util.Scanner;

public class FirstNameLastName {
    public static void main(String[] args) {
        /* FirstNameLastName Task: Write a program that asks the user to enter first and last names and then prints the full name in regular format
(first character in uppercase).
        Example:      Input:
                  firstName = "cyDEo";
                  lastName = "SCHOOL";
              Output:
                   Cydeo School
         */
        Scanner input = new Scanner(System.in);
        System.out.println("Enter first name: ");
        String first = input.next();
     //  String firstName= first.toUpperCase().substring(0, first.toLowerCase());
        System.out.println("Enter last name: ");
       String last =  input.next();
      String lastName= last.toUpperCase();//substring(0).toLowerCase();
        input.close();

       // System.out.println(firstName + " " + lastName);

    }
}
