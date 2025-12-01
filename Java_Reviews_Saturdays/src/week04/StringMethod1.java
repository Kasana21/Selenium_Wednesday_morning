package week04;

import java.util.Scanner;

public class StringMethod1 {


        public static void main(java.lang.String[] args) {

            // Scanner input = new Scanner(System.in);

            java.lang.String str =new java.lang.String("Java");//Heap
            java.lang.String str1 = "Java";

            java.lang.String str2 = "Java";
            //

            System.out.println("str1= "+str1);
            System.out.println("str2 = " + str2);


            System.out.println(str1==str2);//false. dont use ==

            System.out.println(str1.equals(str2));
            System.out.println("=================================");
            java.lang.String s1 = "Batch 28";
            java.lang.String s2 = "Batch 28";

            System.out.println(s1==s2);

            java.lang.String s3 = new Scanner(System.in).nextLine();//new String ("Batch 28")

            System.out.println(s2 == s3);//false
            System.out.println(s2.equals(s3));// equals operator checks the values of 2 different object.
            //objects are different but value is the same

            System.out.println("===============================");

            java.lang.String a1 = "Wooden Spoon";
            java.lang.String a2 = "Wooden Spoon";
            java.lang.String a3 = "Wooden Spoon";
            java.lang.String a4 = "Wooden Spoon";
            java.lang.String a5 = "Wooden Spoon";

            java.lang.String b1 = new java.lang.String("Wooden Spoon");
            java.lang.String b2 = new java.lang.String("Wooden Spoon");
            java.lang.String b3 = new java.lang.String("Wooden Spoon");
            java.lang.String b4 = new java.lang.String("Wooden Spoon");
            java.lang.String b5 = new java.lang.String("Wooden Spoon");


        }
    }



