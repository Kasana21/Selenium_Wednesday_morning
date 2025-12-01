package week03;

public class UnaryOperators {
    public static void main(String[] args) {
        //New email notification. Your received one more email:
        int inbox = 10;
        //one more email:
        inbox = inbox + 1;
        inbox++;
        System.out.println("inbox = " + inbox);

        //During the gaming, one life is lost:
        int lives = 3;
        //lives = lives - 1;
        lives--;
        System.out.println("Lives left = " + lives);

        //Show a negative temperature reading:
        int temperature = 15;
        int belowZero = -temperature;
        System.out.println("belowZero = " + belowZero);
    }
}