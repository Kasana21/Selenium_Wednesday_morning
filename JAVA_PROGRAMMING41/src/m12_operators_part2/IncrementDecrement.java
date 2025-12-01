package m12_operators_part2;

public class IncrementDecrement {
    public static void main(String[] args) {
        //pre-increment  & pre-decrement
        int x = 5;
        int y = ++x; // x = 6, so y becomes 6

        System.out.println("x = "+x);//x = 6
        System.out.println("y = "+y);//y = 6

        int a = 10;
        int b = --a;//b = 9. so now values a and b is 9, because java reads top to bottom
        System.out.println("a = " + a);//a = 9
        System.out.println("b = " + b);//b = 9

        System.out.println("======================");
        //post increment & post decrement
        //there is 2 step: 1. passing current value. 2 then it will chenge the value by 1
        int m = 5;
        int n = m ++;//it will pass current value meaning 5

        System.out.println("m = " + m); //m = 6
        System.out.println("n = " + n); //n = 5

        int r = 10;
        int t = r --;//t =10, r==>9
        System.out.println("r = " + r);//r = 9
        System.out.println("t = " + t);//t = 10





    }
}
