package week03;

public class ArithmeticOperators {
    public static void main(String[] args) {
        //➕ Addition Example – Total Fruits:
        int apples = 5;
        int bananas = 3;
        int totalNumberOfFruits = apples + bananas;
        System.out.println("totalNumberOfFruits = " + totalNumberOfFruits);
        System.out.println("total = " + (apples + bananas));

        //➖ Subtraction Example – Wallet After Purchase:
        double wallet = 120.44;
        double price = 23.44;
        System.out.println(wallet - price);
        System.out.println(34.22 - 10.22);

        double remaining = wallet - price;
        System.out.println("remaining = $" + remaining);

        //✖️ Multiplication Example – Items in Boxes:
        int boxes = 5;
        int itemsPerBox = 3;
        System.out.println("Total items count : " + (boxes * itemsPerBox));
        int totalItems = boxes * itemsPerBox;
        System.out.println("totalItems = " + totalItems);

        //➗ Division Example – Time per Task:
        int totalMinutes = 5;
        int task = 7;
        int minutesPerTask = totalMinutes / task;
        System.out.println("minutesPerTask = " + minutesPerTask);

        //➗ Modulus/Remainder Example – Leftover Chocolates:
        int chocolates = 51;
        int friends = 6;
        System.out.println(chocolates % friends);
        int leftOver = chocolates % friends;
        System.out.println("leftOver = " + leftOver);

        //From totalSeconds calculate minutes and remainingSeconds:
        int totalSeconds = 550;
        int minutes = totalSeconds / 60;
        int remainingSeconds = totalSeconds % 60;
        //-In 550 seconds - there are 9 minutes and 10 seconds
        System.out.println("In " + totalSeconds + " seconds - there are " + minutes + " minutes and " + remainingSeconds + " seconds");
    }
}