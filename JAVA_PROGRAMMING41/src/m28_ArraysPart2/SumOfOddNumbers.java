package m28_ArraysPart2;

public class SumOfOddNumbers {
    public static int sumOFOddNumbers(int[] numbers){
        int sum = 0;
        for (int number : numbers) {
            if(number %2 != 0){
                sum += number;
            }
        }
        return sum;
    }
    public static void main(String[] args) {

        int[] x  = {2, 5, 7, 2, 3 };
        int[] y ={3, 3, 2, 3, 2, 3};

        System.out.println(sumOFOddNumbers(x));
        System.out.println( sumOFOddNumbers(y));


    }
}
