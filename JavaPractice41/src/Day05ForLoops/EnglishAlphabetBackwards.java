package Day05ForLoops;

public class EnglishAlphabetBackwards {
    public static void main(String[] args) {
        /*
 EnglishAlphabetsBackward Task: Create a class named EnglishAlphabetsBackward, and write a program that can display the alphabet letters from Z to A in the same line separated by a space.
         */
        for (char i = 'Z'; i >='A' ; i--) {
            System.out.print(i + " ");
        }
    }
}
