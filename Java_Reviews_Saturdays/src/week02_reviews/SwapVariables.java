package week02_reviews;

public class SwapVariables {

    public static void main(String[] args) {
        //  with a temporary variable
        int x = 100;
        int y = 200;
        int z = x; //z =100. used for containing the Original Value of x

        // x= y; // x = 200 , x will have the value of y, x no longer have the Original value

        y = z;


        System.out.println(" x = " + x); // 200
        System.out.println("y = " + y);// 100

        System.out.println(" -----------------------------------");

        // without temporary variable (this is an interview question)

        int a = 10;
        int b = 20;

        //a += b;// a = a +b / a =30 / a now equal to the sum of original values of a and b
        a += b;

        b = a - b; // b = 30 -20 = 10 from the sum of original a& b, subtract the b to get original a' value

        //a = a -b; //a = 30 -10 =20
        // a -=b;
        System.out.println( " a= "+ a);
        System.out.println("b = " + b);



    }
}
