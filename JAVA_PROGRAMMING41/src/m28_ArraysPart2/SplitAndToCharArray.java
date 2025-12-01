package m28_ArraysPart2;

import java.util.Arrays;

public class SplitAndToCharArray {
    public static void main(String[] args) {
        String str = "Apple, Banana, Orange, Cherry, Strawberry";

        String [] fruits = str.split(", ");
        System.out.println(Arrays.toString(fruits));//[Apple, Banana, Orange, Cherry, Strawberry]

        System.out.println("======================================");

        String str2 = "hello world";
       char[] charArray = str2.toCharArray();
        System.out.println(Arrays.toString(charArray));

    }
}
