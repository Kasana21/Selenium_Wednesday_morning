package Day04Statements;

public class MedianNumber_IfStatement {
    public static void main(String[] args) {
        /*
MedianNumber Task: Create a class named MedianNumber. Write a program that finds the median number between
three DIFFERENT given integers (Assume that the given three integers are distinct numbers).
			Example:
				   a = 10;
				   b = 15;
				   c = 20;

			Output:
				  15 is the median number
         */

        int a = 10;
        int b = 15;
        int c = 20;
        boolean aIsMedian = (a > b && a<c) || (a > c && a <b);
        boolean bIsMedian = (b > a && b < c) || (b > c && b < a);

        int median ;

        if (aIsMedian){
           median = a;
        }else if(bIsMedian){
            median = b;
        }else {
            median = c;
        }
        System.out.println(median + " is a median number");
    }
}
