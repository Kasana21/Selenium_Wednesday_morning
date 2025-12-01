package Day03;

public class SwapValues {
    public static void main(String[] args) {
        int num1 = 5;
        int num2 = 10;
        System.out.println(num1+ " and "+num2);

        int temp;
        temp = num1;
        num1 =num2;
        num2=temp;
        System.out.println("num1 = "+ num1);
        System.out.println("num2 = "+ num2);

        System.out.println("=========================");

        /*
        int num3 = 5;
        int num4 = 10;

        System.out.println("num3 is " + num3);
        System.out.println("num4 is " + num4);

        num4 = num4 - num3;
        num3 = num4 + num4;

        System.out.println("num3 = "+num3);
        System.out.println("num4 = "+num4);
        */

        //????
         int num3 = 5;
         int num4 = 10;

         num3 = num3 + num1;
         num4 = num3 - num4;
         num3 = num3 - num4;

        System.out.println("num3 = "+num3);
        System.out.println("num4 = "+num4);

        System.out.println("=========================");
        // syntax for swapping is + - - then will swap, if do - - + will get not correct numbers

        int a = 43 ;
        int b = 65;

        a = a + b;
        b = a - b;
        a = a - b;

        System.out.println("a = "+ a);
        System.out.println("b = "+ b);









    }
}
