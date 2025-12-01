package m24_user_input_scanner;

import java.util.Scanner;

public class ScannerCharString {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter a character: ");

        char ch = input.next().charAt(0);
        System.out.println("Would you like to continue?");
        String answer = input.next();

        input.close();

        System.out.println("ch = " + ch);
        System.out.println("answer = " + answer);
    }
}
