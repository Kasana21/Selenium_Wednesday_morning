package m12_operators_part2;

public class MixedOperations {
    public static void main(String[] args) {
        /*
        Casting larger primitive types to smaller primitive types
        There is a risk of loosing data.
        Must be done explicitly(manually by programmer)

        !!!When an operation involves two different data types(except byte and short),
        the smaller is casted implicitly to the larger type.

        !!! byte and short are implicitly casted to int type before ariyhmetic operation.
         */

        byte num1  = 100;
        short num2 = 20;


        //must be casted to the smaller from bigger like bellow
        short num3 = (short) (num1 + num2);
        System.out.println(num3);//120

        int a = 100;
        long b = 200;

        long c = a + b;

        short x = 2;
        float y =2.5f;

        float z = x *y;

        System.out.println(z);//5.0

        System.out.println(9 / 2.5);//3.6 this is mixed operation, implicit casting so smaller will be casted to bigger one, meaning int will be casted double
        System.out.println(9 / 3);//same operation int and int








    }
}
