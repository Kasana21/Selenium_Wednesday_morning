package m17_loops_part2;

public class NumberTriangle {
    public static void main(String[] args) {
 /*Write a program that prints the number triangle which starts from 1 and ends at given number.
           Example: Input: 5
            Output:
                 1
                 12
                 123
                 1234
                 12345
         */

        int rows = 5;

        for (int i = 1; i <= rows; i++) {
            for (int j = 1; j <= i ; j++) {
                System.out.print(j+ " ");
            }
            System.out.println();
        }

    }
}
