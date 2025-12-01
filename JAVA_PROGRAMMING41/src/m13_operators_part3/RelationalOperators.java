package m13_operators_part3;

public class RelationalOperators {
    public static void main(String[] args) {
        int x = 0;
        System.out.println(x < 1);//true 0<1
        System.out.println(x>1);//false 0 is not > 1
        // as long as 1 of 2 operators is true it will return true
        System.out.println( x >= 0);//true because 0 is equal to 0.
        System.out.println( x <= 10);//true because 0 is equal to 10
        System.out.println(x>=25);//false because neither operators 0 >= to 25
        System.out.println(x<=-10);//false, because 0 is bigger that any negative number
        // == and != operators can also used for String
        // == equal operators
        System.out.println(x == 0);//true 0 == 0
        System.out.println(x == 100);//false 0 is not == 100
        // != not equal operator
        System.out.println(x != 0);//false
        System.out.println(x != 100);//true

        System.out.println("Cydeo" == "Java");//false
        System.out.println("Java" == "Java");//true
        System.out.println("Java" != "Python");//true
        System.out.println();
    }
}
