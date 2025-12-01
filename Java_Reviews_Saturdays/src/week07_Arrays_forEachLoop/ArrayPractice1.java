package week07_Arrays_forEachLoop;

import java.util.Arrays;
import java.util.Scanner;

public class ArrayPractice1 {
    public static void main(String[] args) {

        System.out.println("==========================");
        String [] words = {"Java", "Selenium", "API", "SQL", "Wooden Spoon"};
        String [] result = new String[6];// index 0~5(this number always one smaller than provided(6)
        result [2] ="Java";
        result [1] ="Selenium";
        result [3] ="API";

        //System.out.println(Arrays.toString(result));//without a loop [null, Selenium, Java, API, null, null]

        for (int i = words.length-1, j=0;i>=0; i--, j ++) {
            result[i]=words[j];
            //in the string result += words.charAt(i);
        }
        System.out.println(Arrays.toString(result));//[Wooden Spoon, SQL, API, Selenium, Java, null]

        System.out.println("==========================");

        // scores: 10,11,12,13,14,15
        //when dont know what elements are but know how many
        // int [] scores = new int[6];
        //System.out.println(Arrays.toString(scores));//[0, 0, 0, 0, 0, 0]

        //when know what are elements do this
        // int [] scores = {10,11,12,13,14,15};
        // System.out.println(Arrays.toString(scores));//[10, 11, 12, 13, 14, 15]
        System.out.println("============================================");

        //when dont know what elements are, but know how many

        int[] numbers = new int[5];
        Scanner input = new Scanner(System.in);
        for (int i = 0; i < 5; i++) {
            System.out.println("Enter a number");
            numbers[i] = input.nextInt();
        }

      System.out.println(Arrays.toString(numbers));//[10, 20, 30, 40, 50](because lenght is 5 in the loop) been
        // entered by user and accepted to the array.
        //the moment the size of array is set in array object its fixed. so if u give more than declared if gives Array out of Bound

        input.close();
       /* int[] numbers1 = new int[7];
        for (int i = 0; i < numbers1.length; i++) {//length is instant variable, not changable
            System.out.println("En1ter a number");
            numbers1[i] = input.nextInt();
        }
        System.out.println(Arrays.toString(numbers1));*/







    }
}
