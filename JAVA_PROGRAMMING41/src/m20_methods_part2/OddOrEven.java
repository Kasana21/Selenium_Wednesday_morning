package m20_methods_part2;

public class OddOrEven {
    public static void main(String[] args) {
        oddOrEven(100);//100 is even number
        oddOrEven(45);//45 is Odd number

        int a = 203;
        oddOrEven(a);//203 is Odd number
    }
    public static void oddOrEven(int numer){
        if (numer%2==0){
            System.out.println(numer +" is even number");
        }else{
            System.out.println(numer + " is Odd number");
        }
    }
}
