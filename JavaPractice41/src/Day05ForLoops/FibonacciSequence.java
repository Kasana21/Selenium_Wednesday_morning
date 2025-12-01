package Day05ForLoops;

public class FibonacciSequence {
    public static void main(String[] args) {
        /*
        Write a program that generates and prints the Fibonacci sequence up to specififed number of therms
        The Fibonacci series is a numbers where each number is a sumof the two preceding once. it stars with 0 and 1, and each subsequent number is the sum of two previous numbers. the series continues indefinitely.
        Example:
         input : 8
         output : 011235813
         */
        int num1 = 0;
        int num2 = 1;
        int sum = 0;
        for (int i = 1; i<=8; i++) {
            System.out.print(num1+" ");
            sum =num1 + num2;
            num1 = num2;
            num2 = sum;
        }
    }
}
