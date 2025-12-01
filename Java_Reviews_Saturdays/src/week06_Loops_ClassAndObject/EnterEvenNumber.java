package week06_Loops_ClassAndObject;

import java.util.Scanner;

public class EnterEvenNumber {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter an even number: ");
        int num = input.nextInt();
        do{
            if(num % 2 == 0){
                break;
            }
            System.out.println(num+" is not an even number, please re-enter");
            num=input.nextInt();//10 or whatever number that was entered
        }while(num % 2 !=0);
        System.out.println("Even number: " + num);

       /*while(num % 2 !=0){
            System.out.println(num+" is not an even number, please re-enter");
            num=input.nextInt();//10 or whatever number that was entered
        }

        System.out.println("Even number: "+num);*/

    }
}
/*
write a program that asks to enter even number UNTIL user enters a valid number
 */