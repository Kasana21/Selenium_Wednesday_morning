package week05;

public class PrimeNumber {
    public static void main(String[] args) {
        int num = 7; //Not divisible by 2,3,4,5,6
        boolean isPrime = true;
        for (int i = 2; i < num; i++) { // i <= num / 2 -> check till middle only
            if (num % i == 0) {
                isPrime = false;
                break;
            }
        }

        if (isPrime) {
            System.out.println(num + " is a Prime number");
        } else {
            System.out.println(num + " is not a Prime number");
        }
    }
}