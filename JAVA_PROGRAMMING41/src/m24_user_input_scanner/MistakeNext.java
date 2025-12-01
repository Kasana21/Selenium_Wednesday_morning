package m24_user_input_scanner;

import java.util.Scanner;

public class MistakeNext {
    public static void main(String[] args) {
        Scanner scanMe = new Scanner(System.in);

        String firstName, lastName;

        System.out.println("Please write your name?");
        firstName = scanMe.next();
        scanMe.nextLine(); // clearing the enter input so the .nextLine() can operate because the scanner must be empty
        System.out.println("Please write your last name?");
        lastName = scanMe.nextLine();

        scanMe.close();

        System.out.println(firstName + " " + lastName);

    }
}
