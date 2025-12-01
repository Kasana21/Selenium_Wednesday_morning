package week05_CustomMethods_ForLoop;

public class ForLoopPractice2 {
    public static String reverse(String str){
                            //"Cydeo"

        String result = "";
        for (int i = str.length()-1; i >0; i--) {
            result += str.charAt(i);
        }
        return result;
    }
}
