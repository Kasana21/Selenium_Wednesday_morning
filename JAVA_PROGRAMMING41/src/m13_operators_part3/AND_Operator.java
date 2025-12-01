package m13_operators_part3;

public class AND_Operator {
    public static void main(String[] args) {
        /*
        false false  will be false
        false true will  be false
        true false will be false
        true true will be true
         */


        int a = 100;
        //System.out.println();
        System.out.println((a > 0) & (a < 200));//true & true => true

        System.out.println((a == 200) & (a > 50));// false & true => false

        //short curcuit evaluation

        System.out.println((a < 1000) && (a>-100));//false & true => true

        System.out.println((a < 0) && (a > 20));//false (first expresion is false then is not evaluated then returns false
    }


}
