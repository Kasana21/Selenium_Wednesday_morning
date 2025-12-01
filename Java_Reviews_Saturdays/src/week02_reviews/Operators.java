package week02_reviews;

public class Operators {
    public static void main(String[] args) {
        //arithmetic  =
        System.out.println(20 / 3); // 6//20 is numerator and 3 denominator
        System.out.println(20.0 / 3); // 6.66666666667
        System.out.println( 100 % 28 );
        //System.out.println(100 /0); deviding by 0 is not possible
        System.out.println(1+2 +"Result A");


        System.out.println("--------------------");
        //shorthand operators ; =,+=,-=, *= , /=, %=. replacing value with result
        int a = 200;
        System.out.println( "a = " + a);
        a = 2000;
        System.out.println( " a= " + a);

        System.out.println("-------------------");
        int x= 100;
        //x = x +20;
        x+=20;

        System.out.println(x);

        int y = 200;
        y -= 50; // y = y- 50

        System.out.println(y);
        int score = 45;
        score *= 2;
        System.out.println(score);//90

        int points = 100;
        points /= 2;
        System.out.println(points);

        int cents = 100;
        cents -= 60;
        System.out.println(cents);
        int quarter = cents / 25; // 1
        cents -= 25;
        System.out.println(cents);
        int nickles = cents / 5; // 3
       // int remainingCents = cents % 1;
        cents %= 1;

        int amount = 730;
        int hundreds = amount / 100;
        System.out.println(hundreds);
        amount %=100;
        System.out.println(amount);
        int tenth = amount /10 ;
        System.out.println(tenth);

        //amount %=10; this is shorthandoperstor
        amount = amount %10;
        System.out.println(amount);

        System.out.println("-----------------------------");

        System.out.println(-10 +20);
        int q= 25;
        System.out.println(++q);//26

        int r= 50;
        System.out.println(r++);//50
        System.out.println(r);

        int t= 300;
        System.out.println(--t);//299

        int u = 300;
        System.out.println(u--);// 300 at first , then 299






    }
}
