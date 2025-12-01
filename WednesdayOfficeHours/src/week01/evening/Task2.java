package week01.evening;

public class Task2 {
    /*
    Task 2:
Write a Java program that reads an integer between 0 and 1000 and adds all the digits in the integer.
An integer is a number that can be written without a fractional component. For example, 23, 6, 0, and −1245 are integers.
Input Data
Input an integer between 0 and 1000: 565
Expected Output :
The sum of all digits in 565 is 16
     */
    //15   1+5=6
    //in order to find last digit in math we need to use modules with 10
    public static void main(String[] args) {
        System.out.println(15%10);//reminder = 5
        System.out.println(15/10);// 1
        //654
        // if we want to get the last digit which is 5 use % with 10
        System.out.println("thirdDigit = " +654%10);//4
        int thirdDigit = 654%10;
        //how we can get first 2 digit if we divide with 10 we can get first two digit is 65
                  // 65%10==>5
        System.out.println("second Digit="+ 654/10%10);//5
        int secondDigit = 654/10%10;
        //how we can get first digit only if we divide with 100 we can easily get the first digit
        System.out.println(654 / 100);// 6
        int firstDigit = 654 /100;

        int sum = firstDigit+secondDigit+thirdDigit;



    }
}
