package week06_Loops_ClassAndObject;

import java.util.Scanner;

public class NestedLoopPractice1 {
    public static void main(String[] args)  throws InterruptedException{
        Scanner scan = new Scanner(System.in);
        System.out.println("Please enter the number of minutes: ");
        int minutes = scan.nextInt();
        scan.close();

        for (int m = 4; m>=0; m--) {
            for (int s = 59; s >=0 ; s--) {//(for (int z = 60; z >0 ; z--) if z is 60 then zero must be excluded, otherwise we will get 61 seconds in total
                System.out.println(m+" minutes "+ s +" seconds ");// this print statement inside because want to display evert single minute and second in the loop

                Thread.sleep(100);
            }

        }
    }
}
