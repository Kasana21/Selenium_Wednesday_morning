package week06;

public class VoidMethods {

    public static void main(String[] args) {
        printMessage();
        printMessage();
        System.out.println("-------------");
        for (int i = 1; i <= 3; i++) {
            ringBell();
        }
        System.out.println("-------------");
        ringBell(5);

        System.out.println("---------------");
        greetUser("Mike");
        greetUser("Sarah");
        System.out.println("----------------");
        printBoxLabel(96587);
        printBoxLabel(987422421);

        System.out.println("-----------------");

        checkDiscount(11.45);
        double price = 109.65;
        checkDiscount(price);

        System.out.println("-----------------");
        canBookFlight(false, false);
        canBookFlight(true, false);
        System.out.println("-----------------");

        repeatWord("Hi", 5);
        repeatWord("I can do it!", 100);
        repeatWord("Selenium", 4);
    }

    //📣 Repeat a Word
    public static void repeatWord(String word, int times) {
        for (int i = 1; i <= times; i++) {
            System.out.print(word + " ");
        }
        System.out.println();
    }
    //🛫 Can Book Flight (passport OR ID)
    public static void canBookFlight(boolean hasPassport, boolean hasIDCard) {
        if (hasPassport || hasIDCard) {
            System.out.println("Booking successful");
        } else {
            System.out.println("Cannot book flight");
        }
    }

    //🛍️ Check Discount Eligibility
    public static void checkDiscount(double total) {
        System.out.println("Your total: $" + total);
        if (total >= 100.0) {
            System.out.println("You get a discount!");
        } else {
            System.out.println("No discount today.");
        }
    }

    public static void printBoxLabel(int id) {
        System.out.println("###################");
        System.out.println("# Box ID: <" + id + ">");
        System.out.println("###################");
    }

    public static void printMessage() {
        System.out.println("Hello there! Let's code Java!");
    }

    public static void ringBell() {
        System.out.println("\uD83D\uDD14 Ring Ring!");
    }

    public static void ringBell(int count) {
        for (int i = 1; i <= count; i++) {
            System.out.println("\uD83D\uDD14 Ring Ring!");
        }
    }

    //🙋 Greet a User by Name
    //greetUser("Mike");
    public static void greetUser(String name) {
        System.out.println("Hello " + name + "! Welcome back!");
    }
}