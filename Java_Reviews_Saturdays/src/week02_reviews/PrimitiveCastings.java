package week02_reviews;

public class PrimitiveCastings {
    public static void main(String[] args) {

        // byte < short < int < long< float<double
        // implicit primitive casting : smaller to larger

        byte a = 50;
        long b = a;
        double c = 100;

        // explicit primitive casting: happens authomaticly larger to smaller

        double x = 10.5 ;
        int y = (int) x;

        long z = 1000;
        short q = (byte) z;


        /*
        concatenation vs addition
        addition :
        number + number

        concatenation
        string


         */


    }

}
