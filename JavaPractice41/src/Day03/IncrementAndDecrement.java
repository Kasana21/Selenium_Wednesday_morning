package Day03;

public class IncrementAndDecrement {
    public static void main(String[] args) {
        int x =2;
        int y = x++ ;
        System.out.println(y);//2


        x = 2;
        System.out.println(x++);//2

        x = 2;
        System.out.println(--x);//1

        x = 8;
        y = x--;
        System.out.println(y);//8

        int a = 10;
        a = --a + a++ + a-- + a++;
        System.out.println(a);//37

        int m =4;
        int n = --m * 4 - m++;
        System.out.println("m = " + m);//m = 4
        System.out.println("n = " + n);//n = 9

    }
}
