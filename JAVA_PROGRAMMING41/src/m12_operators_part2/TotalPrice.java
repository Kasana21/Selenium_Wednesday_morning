package m12_operators_part2;

public class TotalPrice {
    public static void main(String[] args) {

        //this is propper way

        double price = 10;
        int quantity = 5;

        price *= quantity;
        System.out.println("price = $" + price);//price = 50.0


        /*
       // but there is a bug, because its multipying by the privided number not int quantity that is provided.
        double price = 20.5;
        int quantity = 6;

        price *= 4;
        System.out.println("price = " + price);//price = 82.0
        */



    }
}
