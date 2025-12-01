package Day05ForLoops;

public class AnyGivenNumber {
    public static void main(String[] args) {
        /*
        Write a program that prints the pattern like below for any given number
        Example:
        Input: 6
        Output:
         #
           #
             #
               #
                 #
                   #
         */

 int  hash = 6;
        for (int i = 0; i < hash; i++) {
            for (int j = 0; j < i ; j++) {
                System.out.print(" ");
            }
            System.out.println("#");
        }
    }
}
