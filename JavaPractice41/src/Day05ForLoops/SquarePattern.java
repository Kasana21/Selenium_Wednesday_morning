package Day05ForLoops;

public class SquarePattern {
    public static void main(String[] args) {
        /*
        Write a program (using “while” loop) that prints the square pattern which has the same number of stars and number of rows with any given number.
Hint: use two spaces between the stars.
Example:
Input: 6

Output:
******
******
******
******
******
******
         */

        int stars = 6;
        for (int i = 1; i <= stars; i++) {

            for (int j = 1; j <= stars; j++) {
                System.out.print("*  ");
            }

            System.out.println();
        }
    }
}
