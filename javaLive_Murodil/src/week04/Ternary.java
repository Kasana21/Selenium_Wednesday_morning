package week04;

public class Ternary {
    public static void main(String[] args) {
        int num = 5;
        String result = (num % 2 == 0) ? "Even" : "Odd";
        System.out.println(num + " is " + result);
        System.out.println((num % 2 == 0) ? "Even" : "Odd");

        System.out.println("---------");
        int num1 = 10;
        int num2 = 5;
        int larger = (num1 > num2) ? num1 : num2;
        System.out.println("larger = " + larger);
    }
}