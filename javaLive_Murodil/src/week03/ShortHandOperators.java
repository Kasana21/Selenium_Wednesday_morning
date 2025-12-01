package week03;

public class ShortHandOperators {
    public static void main(String[] args) {
        //You scored 5 more points in a game:
        int score = 10;
        //score = score + 5;
        score += 5;
        System.out.println("Total score = " + score);

        //You spent $30 from your $100 wallet:
        double wallet = 100.0;
        wallet -= 30.0;
        System.out.println("Money left = $" + wallet);

        double price = 25.0;
        wallet -= price;
        System.out.println("Money left = $" + wallet);

        //You restock 4 times more boxes:
        int boxes = 3;
        //boxes = boxes * 4;
        boxes *= 4;
        System.out.println("boxes = " + boxes);

        //You plan to read a 100-page book over 5 days:
        int totalPages = 100;
        //int pagePerDay = totalPages / 5;
        totalPages /= 5;
        System.out.println("Pages per day = " + totalPages);

        //You share 17 candies with 6 friends:
        int candies = 17;
        candies %= 6;
        System.out.println("Leftover candies = " + candies);

        //Parking lot cars are coming and leaving:
        int cars = 10;
        cars += 5;
        System.out.println("total cars = " +  cars);

        cars -= 3;
        System.out.println("total cars = " +  cars);

        cars *= 2;
        System.out.println("total cars = " +  cars);

    }
}