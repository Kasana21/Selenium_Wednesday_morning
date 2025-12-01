package m29_ArraysPart3;

import java.util.Arrays;

public class Iterating2DArrays {
    public static void main(String[] args) {
        // !!!!!! if you have 3D arrays it will be extra inner loop in nested loop and so on

        //for loop for acccessing, updating and reversing
        //index:                0                  1                  2
        int [][] arr2D = { {10, 20, 30}, {40, 50, 60, 70, 80}, {90, 100, 110, 120}};
        //elements:          0   1   2     0   1   2   3   4     0   1    2    3

        for (int i = 0; i < arr2D.length; i++) { //i: 0, 1, 2
           int[] each1DArray = arr2D[i];
            System.out.println(Arrays.toString(each1DArray));// shows every single 1D arrya that stored in the loop [10, 20, 30] [40, 50, 60, 70, 80] [90, 100, 110, 120]

            for (int j = 0; j < each1DArray.length; j++) {//using this loop to iterate every index of every 1Darray
                System.out.println(each1DArray[j]);
            }
            /*
            [10, 20, 30]     [40, 50, 60, 70, 80]  [90, 100, 110, 120]
             10               40                    90
             20               50                    100
             30               60                    110
                              70                    120
                              80
             */
        }

        System.out.println("============================================");
        //forEach loop to JUST access all of the elements of the 2D array from first to the last used only to Access them without updating them, any reversing. for each dont have access to the index numbers so u cant do starting with 3d element . its just gets elements from from 1st to the last
        for (int[] each1Array : arr2D) {
            System.out.println(Arrays.toString(each1Array));
            /*
             [10, 20, 30]
             [40, 50, 60, 70, 80]
             [90, 100, 110, 120]
             */
            // for accessing the elements of the array u can use another forEach loop
            for (int eachElement : each1Array){
                System.out.println(eachElement);
                /*
                   [10, 20, 30]     [40, 50, 60, 70, 80]  [90, 100, 110, 120]
                    10               40                    90
                    20               50                    100
                    30               60                    110
                                     70                    120
                                     80

                 */
            }
            System.out.println("============================================");
            //reversing 2D Array
            for (int i = arr2D.length - 1; i >= 0; i--) {//i srt to the last index of 2D array
                for (int j = arr2D[i].length - 1; j >= 0; j--) {//j is set to the last index of 1D array
                    System.out.println(arr2D[i][j]);
                    // 120->10 (in each line by one number because .println )
                }
                
            }
        }
        System.out.println("============================================");
        //this doest work it prints from 10->120 and not reverse
        for (int[] each1DArray : arr2D){
            for (int eachElement : each1DArray){
                System.out.println(eachElement);
            }
        }


    }
}
