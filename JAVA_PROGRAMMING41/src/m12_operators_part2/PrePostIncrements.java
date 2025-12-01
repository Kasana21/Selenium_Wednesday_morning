package m12_operators_part2;

public class PrePostIncrements {
    public static void main(String[] args) {
        int x = 10;
        int y = 22;
        System.out.println(x++ + x);//21
        //                 10  + 11 =21,    x =11
        System.out.println(x++ + ++y);//34
        //                11 + 23 =34  ,    x = 12 ,y =23
        System.out.println(++x % 5);//3
        //                13 % 5 = 3 ;      x = 13

        System.out.println("x = " + x); //x = 13
        System.out.println("y = " + y);// y = 23

    }
}
