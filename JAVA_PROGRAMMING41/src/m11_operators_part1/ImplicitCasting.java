package m11_operators_part1;

public class ImplicitCasting {
    public static void main(String[] args) {

        /* casting from smaller to bigger primitive is done implicitly by the system
        Implicitly done by the compiler (automatic type conversion)
         */

        byte num1 = 25;
        int num2 = num1;// implicit casting
        System.out.println("num1 = " + num1);// 23 because it wasnt reassigned
        System.out.println("num2 = " + num2); //25

        double num3;
        int num4 = 10;

        num3 = num4;//10.0 implicit casting from int to double
        System.out.println("num3 = " + num3);
        System.out.println("num4 = " + num4);





    }
}
