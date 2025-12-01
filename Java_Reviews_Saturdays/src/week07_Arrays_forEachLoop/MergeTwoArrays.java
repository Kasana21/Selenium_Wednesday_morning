package week07_Arrays_forEachLoop;

import java.util.Arrays;

public class MergeTwoArrays {
    public static void main(String[] args) {
        String[] arr1 = {"A", "B", "C", "D","Java","Phyton"};//index : 0~5
        String[] arr2 = {"E", "F", "G"};//index: 0~2
        String [] arr3 = new String[arr1.length+ arr2.length];// [7]because lenght must be length of arr1 and arr2

        int k = 0;//for index of 3d array
        for (int i = 0; i < arr1.length; i++) {//i: for index of 1st array
            arr3[k]= arr1[i];//elements of 1st array assigned to the indexes of 3d array  [A,B,C,D,null,null,null]
        }
        for (int j = 0; j < arr2.length; j++,k++) {//i: for index of 2nd array
            arr3[k]=arr2[j];// elements of 2nd array assigned to the indexes of 3d array  [E, F, G, null, null, null, null]
        }
        System.out.println(Arrays.toString(arr3));
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