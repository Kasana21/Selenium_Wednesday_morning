package week03;

public class ShirtSelection {
    public static void main(String[] args) {
        char size = 'M';
        String color = "blue";
        double price = 16.00;

        // true                         true                                true
        //boolean willBuy = (size == 'M') && (color == "blue" || color == "tan") && (price >= 10.0 && price <= 30.0);
        boolean willBuy = (size == 'M') && (color == "blue") && (price <= 30.0);
        System.out.println("willBuy = " + willBuy);
    }
}