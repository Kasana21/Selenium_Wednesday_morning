package m28_ArraysPart2;

public class FindMaxNumberFromArray {
    public static void main(String[] args) {

        int[] x = {10, 2, 3, 40, 20};
        System.out.println(maxValue(x));//40

        int[] y = {3, 3, 2, 3, 2, 3};
        System.out.println(maxValue(y));//3

        int[] m = {};
        System.out.println(maxValue(m));//Array is empty // 0

    }
    public static int maxValue (int[] numbers){
        if (numbers == null || numbers.length==0){
            System.out.println("Array is empty");
            return 0;
        }
        int max = numbers[0];
        for (int number : numbers) {
            if (number >= max){
                max = number;
            }
        }
        return max;
    }
}
