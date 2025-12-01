package m20_methods_part2;

public class ReturnMethods {
    public static void main(String[] args) {
        int result = addNumbers(10, 20);
        System.out.println(result);

        System.out.println(addNumbers(100, 200));
    }
    public static int addNumbers(int num1, int num2){
        int num3 = num1 + num2;
        return num3;
    }
}
