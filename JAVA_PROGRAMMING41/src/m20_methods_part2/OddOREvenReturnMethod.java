package m20_methods_part2;

public class OddOREvenReturnMethod {
    public static void main(String[] args) {
       /* int a = 100;
        System.out.println(a + " is " + returnOddOrEven(a));
        */
        String s1 =returnOddOrEven(100);
        System.out.println(s1);

    }
    public static String returnOddOrEven (int num){
        if (num%2 == 0){
            return "Even";
        }else{
           return "Odd";
        }

    }
}
