package Day08_StringClass;

import java.util.Scanner;

public class WithoutFirstChar {
    public static void main(String[] args) {
        /*WithoutFirstChar Task: Create a class named WithoutFirstChar. Ask the user to enter two words. Print the first word without its first character, then print the second word without its first character.
        Example:
              Inputs:
                  apple
                  banana
              Output:
                   ppleanana
         */

        Scanner input = new Scanner(System.in);
        System.out.println("Enter first word: ");
        String firstWord = input.next();
        String secondWord = input.next();
        input.close();

        System.out.println(firstWord.substring(1)+secondWord.substring(1));

    }
}
