package Day08_StringClass;

import java.util.Scanner;

public class StarsWithX {
    public static void main(String[] args) {
        /* StartsWithX Task: Create a class named StartsWithX and write a program that asks  the user to enter a word.
If the word starts with 'x,' replace it with 'a'.
        Example:
              Input:xcodex
              Output: acodex
         */
        Scanner input = new Scanner(System.in);
        System.out.println("Enter the word please: ");
        String s = input.next().replaceFirst("x","a");
        System.out.println(s);


    }

}
