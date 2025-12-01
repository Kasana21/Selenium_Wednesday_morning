package Day09_Arrays;

public class EvenOddNumbers {
    public static void main(String[] args) {
        int[] numbers = {1, 2, 3, 4, 5, 6, 7, 8, 10, 17};

        int odd = 0;
        int even = 0;
         for(int eachNum : numbers){
             if (eachNum % 2 == 0){
                 even++;
                 }else{
                 odd++;
             }

         }
        System.out.println("The array has " + odd + " odd numbers and " + even + " even numbers");


    }
}
