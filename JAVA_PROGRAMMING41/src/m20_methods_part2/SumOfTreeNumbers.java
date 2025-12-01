package m20_methods_part2;

public class SumOfTreeNumbers {
    public static void main(String[] args) {
        sumOf3Numbers(10, 20, 30);
        int a =10;
        byte b = 20;
        short c =  30;

        sumOf3Numbers(a, b, c);//implicitly cast from smaller to larger(java doest it itself)

        int x = 100;
        long y = 200;
        long z = 300;

        sumOf3Numbers(x, (int)y ,(int) z);//not compatible parameters must be explicitly cast(from larger to smaller)
    }
    public static void sumOf3Numbers(int num1,int num2, int num3){
        System.out.println("Sum of 3 numbers is: "+ (num1+num2+num3));
    }
}
