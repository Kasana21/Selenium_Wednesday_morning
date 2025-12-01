package week07_Arrays_forEachLoop;

import java.util.Arrays;

public class MergeTwoArrays2 {
    public static void main(String[] args) {
        String[] arr1 = {"A", "B", "C", "D", "Java", "Phyton"};//index : 0~5
        String[] arr2 = {"E", "F", "G"};//index: 0~2
        String[] arr3 = new String[arr1.length + arr2.length];// [7]because length must be length of arr1 and arr2

        int k = 0;//for index of 3d array. always start with 0. because if u do-1 will give u bugs late r on
        for (String each : arr1) {// each: elements of 1st array
            arr3[k++]=each;//each element of first array beign assigned to each index of 3d array
        }
        for (String each : arr2) {
            arr3[k++]=each;
        }
        System.out.println(Arrays.toString(arr3));//with both loops[A, B, C, D, Java, Phyton, E, F, G]
    }
}
/*

Tasks:
    Write a program that can merge two arrays of String and retuns the third array

            Ex:
                String[] arr1 = {"A", "B", "C", "D"};
                String[] arr2 = {"E", "F", "G"};

            output:
               arr3 = {"A", "B", "C", "D", "E", "F", "G"};
 */
