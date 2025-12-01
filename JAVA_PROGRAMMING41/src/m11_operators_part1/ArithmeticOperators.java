package m11_operators_part1;

public class ArithmeticOperators {
    public static void main(String[] args) {
        System.out.println(10 + 5);// 15//addition operator.
        System.out.println(10 - 5);//5//subtraction operator
        System.out.println(10 / 5);//2 //division operator
        System.out.println(10 / 4);// in algebra will be 2.5 but in java you will get int result so result is 2.  decimal is nit in java

        System.out.println(10.0 / 4);//2.5 if you make numerator or denominator double type the result will be precise, decimal number
        System.out.println(10D / 4);//2.5

        System.out.println(10 *5 );//50

        //remainder operator- if its evenly divisible then result is 0
        //remainder operator finds the left over what's doesn't divide by 2
        System.out.println(10 % 3 );//1
        //algebra:  10/3 = 3.333....
        //algebra:  10 - (3*3) ==> 1
        System.out.println(10%2);//0
        System.out.println(9 % 2);//1
        System.out.println(14 % 2);//0
        System.out.println(1234 % 10 );// 4
        System.out.println("============================");

        int chairs = 40;//declaration and initialization
        System.out.println(chairs + 2);//value is 42. just printing not reassigned
        int moreChairs =chairs + 5;
        System.out.println(moreChairs);//45 is moreChairs and chairs still 40

        System.out.println("============================");

        System.out.println(12 + 6 / 3 - 5);//9

        // precedence of operators

        // () - parentheses always done first
        // * / % - Multiplication / Division / Modulus come after, or first if there is no ()
        // + - -Addition / Subtraction is done the last . and first if none of the above present
    }
}
