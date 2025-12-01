package m28_ArraysPart2;

import java.util.Arrays;

public class HowManyWords____IQ {
    public static void main(String[] args) {
        String str = "In computer programming, white space refers to any character or sequence of character that " + "represent empty space or have no visible representation when rendered. ";
       String[] words =  str.split(" ");
      //  System.out.println(Arrays.toString(words));//[In, computer, programming,, white, space, refers, to, any, character, or, sequence, of, character, that, represent, empty, space, or, have, no, visible, representation, when, rendered.]
        System.out.println(words.length);//24
        System.out.println(str.length());//162

        System.out.println("===========================================================");

        //total number of characters that is displayed even the space included in string
        char[] arr = str.toCharArray();

        System.out.println(Arrays.toString(arr));
        System.out.println(arr.length);//162

        //System.out.println("===========================================================");
        //total number of characters that is displayed without the space included in string
       // char[] arr = str.replace(" ", "").toCharArray();

        //System.out.println(Arrays.toString(arr));
       // System.out.println(arr.length);//139

       // System.out.println("===========================================================");
        //total number of characters that is displayed without the space and without "," and"." included in string
       // char[] arr = str.replace(" ","").replace(",", "").replace(".", "").toCharArray();

        //System.out.println(Arrays.toString(arr));
        //System.out.println(arr.length);//136

        System.out.println("===========================================================");

        System.out.println(str.length() == arr.length);//true

    }


}
