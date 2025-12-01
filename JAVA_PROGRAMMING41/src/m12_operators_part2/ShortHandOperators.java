package m12_operators_part2;

public class ShortHandOperators {
    public static void main(String[] args) {
        //addition assignment operator: +=

        int x = 5;
        System.out.println(x);//5
        //value of x will be reassigned by addition of x above by 5
        x += 5; // x = x+5
        System.out.println(x);//10

        //subtraction assignment operator: -=
        int y = 10;
        System.out.println(y);//10
        //y = y - 4;
        y -= 4; //this is shorter way
        System.out.println(y);//6

        //multiplication assignment operator: *=

        int z = 3;
        System.out.println(z);//3

        //z = z * 5;
        z *= 5;
        System.out.println(z);//15

        //division assignment operator: /=

        int a = 12;

        System.out.println(a);//12

        a /=2;

        System.out.println(a);//6

        //Module assignment operator: %=

        int b = 10;
        System.out.println(b);

        b %= 3;
        System.out.println(b);//1

        System.out.println("==================================");

        //different data types

        //right side will be implicitly casted to the left side
        int c =4;
        c +=20.5;

        System.out.println(c);//24

        double d =2.4;
        d += 4;
        System.out.println(d);//6.4

        int m = 675;
        m -= 325.23;
        System.out.println(m);//349






    }
}
