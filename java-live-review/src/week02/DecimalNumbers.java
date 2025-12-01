package week02;
/*
5) Create new class DecimalNumbers and add main method

Let's practice float and double:
-declare float variable temperature and assign 36.5F then print out
-declare double variable appleStockPrice and assign current value then print out
-declare a variable that can hold wooden spoon price and assign the value
-print it then change value to some other one and print again

You are comparing the prices of two laptops:
- declare and initialize double variable laptopPriceA with 799.99;
- declare and initialize double variable laptopPriceB with 999.49;
- using concatenation print "Laptop A Price: $799.99";
                             "Laptop B Price: $999.49";

Two product ratings are same:
- declare and initialize double variable rating with 4.6;
- declare double variable anotherRating with same value of rating;
- print using variables and concatenation:
    "Product 1 rating is 4.6 and Product 2 rating is 4.6"
 */
public class DecimalNumbers {
    public static void main(String[] args) {
        //-declare float variable temperature and assign 36.5F then print out
        float temperature =36.5F; //36.5
        System.out.println(temperature);

        System.out.println("--------------------------------");
        //-declare double variable appleStockPrice and assign current value then print out
        double appleStockPrice =213.88;
        System.out.println("$AAPL stock price = $" + appleStockPrice );//$AAPL stock price = $213.88

        System.out.println("--------------------------------");

        //-declare a variable that can hold wooden spoon price and assign the value
        double woodenSpoonPrice = 9.99;
        System.out.println("Wooden spoon price is $" + woodenSpoonPrice);//Wooden spoon price is $9.99
        woodenSpoonPrice = 11.50;
        System.out.println("New wooden spoon price is $"+woodenSpoonPrice);//New wooden spoon price is $11.5


        System.out.println("--------------------------------");
        double laptopPriceA = 799.99;
        double laptopPriceB = 999.49;

        System.out.println("Laptop A Price: $" + laptopPriceA);
        System.out.println("Laptop A Price: $" + laptopPriceB);


        System.out.println("--------------------------------");
        //Two product ratings are same:
        double ratingOne = 4.6;
        double ratingTwo = 4.6;

        System.out.println("Product 1 rating is "+ratingOne+" and Product 2 rating is "+ ratingTwo);






    }

}
