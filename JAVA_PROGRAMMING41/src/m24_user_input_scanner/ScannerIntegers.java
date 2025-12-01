package m24_user_input_scanner;
import java.util.Scanner;

public class ScannerIntegers {
    public static void main(String[] args) {
        // Scanner will give an Exception error if the data is not matching the datat that need to be provided meanin int must be int and int cant be java
        Scanner input = new Scanner(System.in);
        System.out.println("Enter your first number: ");
        byte firstNum = input.nextByte();//return type is byte value

        System.out.println("Enter your second number: ");
        short secondNum = input.nextShort();

        System.out.println("Enter your third number: ");
        int thirdNum = input.nextInt();

        System.out.println("Enter your forth number: ");
        long forthNum =input.nextLong();

        input.close();
       // System.out.println("Enter your fifth number: ");// Enter your fifth number: //Still will print this message before printing the rest ant if there is an input to give it will give the error message because scanner is closed
        //int fifthNum = input.nextInt();//Exception in thread "main" java.lang.IllegalStateException: Scanner closed

        System.out.println("firstNum = " + firstNum);
        System.out.println("secondNum = " + secondNum);
        System.out.println("thirdNum = " + thirdNum);
        System.out.println("forthNum = " + forthNum);



    }
}
