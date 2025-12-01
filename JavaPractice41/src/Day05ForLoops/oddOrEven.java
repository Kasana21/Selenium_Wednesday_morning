package Day05ForLoops;

import java.util.Scanner;

    public class oddOrEven {

        public static void checkOddEven() {
            Scanner scanner = new Scanner(System.in);
            System.out.print("Enter a number: ");

            if (scanner.hasNextInt()) {
                int number = scanner.nextInt();

                if (number % 2 == 0) {
                    System.out.println(number + " is even.");
                } else {
                    System.out.println(number + " is odd.");
                }
            } else {
                System.out.println("Not valid input");
            }

            scanner.close();
        }

        public static void main(String[] args) {
            checkOddEven();
        }
    }

