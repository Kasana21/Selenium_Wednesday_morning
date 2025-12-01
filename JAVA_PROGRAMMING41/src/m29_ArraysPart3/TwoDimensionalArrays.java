package m29_ArraysPart3;

import java.util.Arrays;

public class TwoDimensionalArrays {
    public static void main(String[] args) {
        int [] arr1 = {10, 20, 30};
        int [] arr2 = {40, 50, 60, 70};
        int [] arr3 = {80, 90};


        //[][] <- second square bracet is not needed to be specified, ONLY when you kknow how many elements will be provided in the single array and the number of elements will be matching each array
        int[][] numbers = new int[3][];//index: 0,1,2
        numbers[0] = arr1;
        numbers[1] = arr2;
        numbers[2] = arr3;

        System.out.println(Arrays.deepToString(numbers));//[[10, 20, 30], [40, 50, 60, 70], [80, 90]]

        //access of singeDimensional array
        System.out.println(Arrays.toString(numbers[1]));//[40, 50, 60, 70]
        System.out.println(Arrays.toString(numbers[2]));//[80, 90]

        //access of specific element
        System.out.println(numbers[1][2]);//60
        System.out.println(numbers[2][0]);//80

        System.out.println("=================================================");//instantiating single Dimensional arrays in 2Dimensional  array

         //index:              0             1               2
        int [][] arr2D = { {10, 20, 30}, {40, 50, 60, 70, 80}, {90, 100} };
        //elements index:    0   1  2      0   1   2   3   4      0   1

        System.out.println(arr2D.length);//3
        System.out.println(arr2D);//[[I@5acf9800 you will get hashcode.need .deepToString method

        System.out.println(Arrays.deepToString(arr2D));//[[10, 20, 30], [40, 50, 60, 70, 80], [90, 100]]

        //to get the single Dimensional array
        System.out.println(Arrays.toString(arr2D[1]) );//[40, 50, 60, 70, 80]

        //to get element of singleDementional array from 2Darray
        System.out.println(arr2D[1][2]);//60

        //to update the value of element in single in 2Darray
        arr2D[0][2] = 3000;
        arr2D[2][0] = 9000;
        System.out.println(Arrays.deepToString(arr2D));//[[10, 20, 3000], [40, 50, 60, 70, 80], [9000, 100]]

        System.out.println("===================================================");
        //formula for multi dimensional arrays
        // n dimensional arrays is container for (n-1) dimensional arrays
        //2D arrays is container for 1D arrays
        //3D arrays is container for 2D arrays

        // example of multiDimencional arrays image processing, gridBased games.Scientific Data Matrix Operations #D Graphics Image Filters









    }
}
