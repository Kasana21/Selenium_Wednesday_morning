package m13_operators_part3;

public class OR_Operator {
    public static void main(String[] args) {
        int x =50;
        // if first condition is true oin bitwise operators | second condition is not going to be evaluated and will return first boolean
        System.out.println((x < 100) | (x > 0));//true
        //                     true  |  true  ==> true
        System.out.println(( x < 100) || (x > 0));//true
        //                      true --  ==>    true
        System.out.println( x > 100 || x < 0);// false
        //                    false || false

    }
}
