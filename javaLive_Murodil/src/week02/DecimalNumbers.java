package week02;

//let's practice float and double

public class DecimalNumbers {
    public static void main(String[] args) {
        float temperature = 36.5F;
        System.out.println(temperature);

        //-declare double variable appleStockPrice and assign current value then print out
        double appleStockPrice = 213.88;
        System.out.println("$AAPL stock price = $" + appleStockPrice);

        //-declare a variable that can hold wooden spoon price and assign the value
        double woodenSpoonPrice = 9.99;
        System.out.println("Wooden spoon price is $" + woodenSpoonPrice);
        woodenSpoonPrice = 11.50;
        System.out.println("New Wooden spoon price is $" + woodenSpoonPrice);

        System.out.println("------------");

        double laptopPriceA = 799.99, laptopPriceB = 999.49;

        System.out.println("Laptop A price : $" + laptopPriceA);
        System.out.println("Laptop B price : $" + laptopPriceB);

        System.out.println("--------------");

        //Two product ratings are same:

        double rating = 4.6;
        double anotherRating = rating;

        // "Product 1 rating is 4.6 and Product 2 rating is 4.6"
        System.out.println("Product 1 rating is " + rating + " and Product 2 rating is " + anotherRating);

    }
}