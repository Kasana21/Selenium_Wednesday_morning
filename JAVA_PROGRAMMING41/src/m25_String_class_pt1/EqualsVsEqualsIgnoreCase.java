package m25_String_class_pt1;

public class EqualsVsEqualsIgnoreCase {
    public static void main(String[] args) {
        String str1 = "CYDEO";
        String str2 = "cydeo";
        System.out.println(str1 == str2);// false
        System.out.println(str1.equals(str2));//false
        System.out.println(str1.equalsIgnoreCase(str2));//true just compares the characters
    }
}
