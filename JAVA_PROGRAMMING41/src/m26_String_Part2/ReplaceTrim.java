package m26_String_Part2;

public class ReplaceTrim {
    public static void main(String[] args) {
        String str = "Apple Apple Apple";

      str =  str.replace("Apple", "Cherry");//Cherry Cherry Cherry
       // str = str.replaceAll("Apple", "Cherry");
        System.out.println( str);

        str = str.replaceFirst("Cherry", "Grape");
        System.out.println(str);//Grape Cherry Cherry

        //trim() <-- used to remove white spaces
        String s = "       Cydeo School      ";
        s = s.trim();
        System.out.println(s);//Cydeo School
    }
}
