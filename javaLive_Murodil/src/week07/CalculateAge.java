package week07;

import week06.MethodsWithReturn;
import java.util.Scanner;

public class CalculateAge {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Please enter birth year:");
        int birthYear = input.nextInt();

        int age = MethodsWithReturn.calculateAge(birthYear);

        System.out.println("If you are born in " + birthYear + " then you are " + age + " years old.");
        input.close();
    }
}