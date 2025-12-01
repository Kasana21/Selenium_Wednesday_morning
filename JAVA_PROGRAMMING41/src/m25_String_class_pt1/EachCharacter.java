package m25_String_class_pt1;

public class EachCharacter {
    public static void main(String[] args) {
        eachCharacter("hghakdghs");

    }


    public static  void eachCharacter(String str){
        if (str == null || str.length()==0){
            System.err.println("The text can not be empty");
            return;//exits the method
        }
        for (int i = 0; i < str.length(); i++) {// i: index of the string
            System.out.println(str.charAt(i));
        }

    }
}
