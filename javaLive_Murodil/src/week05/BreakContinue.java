package week05;

public class BreakContinue {
    public static void main(String[] args) {
        for (int i = 1; i <= 10; i++) {
            System.out.println("i = " + i);
            if (i == 5) {
                System.out.println("Found the number " + i);
                break; //exit loop
            }
        }

        System.out.println("After for loop");

        for (int i = 1; i <= 100; i++) {
            //skip even numbers
            if (i % 2 == 0) {
                continue;//goto next iteration. skip rest of code
            }
            System.out.println(i);
        }

        System.out.println("-----------");
        //return
        for (int days = 1; days <= 7; days++) {
            if (days == 6) {
                System.out.println("Weekend is off");
                return; //exit main method
            }
            System.out.println("Working day - " + days);
        }

        System.out.println("after work days");
    }
}