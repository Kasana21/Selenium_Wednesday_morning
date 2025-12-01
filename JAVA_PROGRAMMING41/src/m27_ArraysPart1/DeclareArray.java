package m27_ArraysPart1;

import java.util.Arrays;

public class DeclareArray {
    public static void main(String[] args) {
        int[] scores;
        scores = new int[4];

       // assigning(updating )the elements

        scores[0] = 85;
        scores[1] = 70;
        scores[2] = 32;
        scores[3] = 95;

        //System.out.println(scores);//[I@3fee733d hashcode if array not .toString
        System.out.println(Arrays.toString(scores));//[0, 0, 0, 0] <-proper wa to print array

        //accesing the elements one by one by passing the index

        System.out.println(scores[0]);//85
        System.out.println(scores[1]);//70
        System.out.println(scores[2]);//32
        System.out.println(scores[3]);//95

        // there is 4 elements in the array so there is 0,1,2,3 indexes of elements
        //score[4] - outOfBoundException

        //System.out.println(scores[4]);
        System.out.println("==============================");

        String[] names = new String[5];// declaring the arrays when you dont know the elements
       System.out.println(Arrays.toString(names));//[null, null, null, null, null]
        //Declaration and initialization of the variables of array(must be done in one statement)
        String [] names1 = {"Java", "Phyton","C#","Ruby", "C++"};//<- when u know what and how many elements are use this way

        //int[] numbers; // u will get a compailor error because need to be in one statent and not like here
        //numbers ={ 10,20,30,30};






    }
}
