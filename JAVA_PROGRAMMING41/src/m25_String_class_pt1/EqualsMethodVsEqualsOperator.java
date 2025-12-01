package m25_String_class_pt1;

public class EqualsMethodVsEqualsOperator {
    public static void main(String[] args) {
        String str1 = "Java",
               str2 = "Java";

        System.out.println(str1 == str2);//true// checking is its referncing to the same object
        System.out.println(str1.equals(str2));//true // it has the same charachters in the same order

        String str3 = new String ("Java");
        String str4 = new String ("Java");

        System.out.println(str3 == str4);//false
        System.out.println(str3.equals(str4));//true

        System.out.println(str1.equals(str3));//true

        String str5 = "java";
        System.out.println(str1.equals(str5));//false
    }
}
