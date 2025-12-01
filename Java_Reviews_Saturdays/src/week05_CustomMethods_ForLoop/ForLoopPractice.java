package week05_CustomMethods_ForLoop;

import java.util.Scanner;

public class ForLoopPractice {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        /*System.out.println("Enter a number");
        scan.nextInt();

        System.out.println("Enter a number");
        scan.nextInt();

        System.out.println("Enter a number");
        scan.nextInt();

        System.out.println("Enter a number");
        scan.nextInt();

        System.out.println("Enter a number");
        scan.nextInt();*/

       /* for (int i = 0; i < 5; i--) { // iterator (i--) doesnt do its job , so loop is infinite
            System.out.println("Enter a number");
            scan.nextInt();*/
            /*for (int i = 0; i > 5; i--) { // if iterator is negative. condition(i>5) is not true so loop is not executed
                System.out.println("Enter a number");
                scan.nextInt();
        }*/
      /*  int max;
        for (int i = 0; i < 5; i++) { // iterator (i--) doesnt do its job , so loop is infinite
            System.out.println("Enter a number");
            scan.nextInt();
        }*/

      /*  for (int i = 1; i < 6; i++) { // if u wanna start from 1 not 0, must give
            System.out.println("Enter a number");
            scan.nextInt();
*/

        int max = -2147483648 ; // max = 10
        int min = 2147483647;

        for (int i = 1; i < 6; i++) {

            System.out.println("Enter a number");
            int num = scan.nextInt(); // 10, 20, 30, 40, 50

            if(num > max){
                max = num;
            }

            if(num < min){
                min = num;
            }


        }


        System.out.println("max = " + max);
        System.out.println("min = " + min);

        scan.close();



    }
}
