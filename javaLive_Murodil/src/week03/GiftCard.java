package week03;

public class GiftCard {
    public static void main(String[] args) {
        double giftCard = 200.0;
        String items = "";
        System.out.println("Buying sneakers for $45");
        giftCard -= 45;
        items = "sneakers";

        System.out.println("Buying jacket for $75.50");
        giftCard -= 75.50;
        items += ", jacket";

        System.out.println("Remaining balance = $" + giftCard);
        System.out.println("All items = " + items);

        String letters = "A";
        letters += "B";
        letters += "C";
        System.out.println("letters = " + letters);
    }
}