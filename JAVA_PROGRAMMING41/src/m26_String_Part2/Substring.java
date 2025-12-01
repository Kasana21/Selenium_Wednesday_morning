package m26_String_Part2;

public class Substring {
    public static void main(String[] args) {
        String str = "Wooden Spoon";
      String firstWord=  str.substring(0,str.indexOf(" "));//.indexOf will show the first occurrence of whatever provided(in our case empty space)
        System.out.println("firstWord = " + firstWord);//firstWord = Wooden
        
        String secondWord = str.substring(str.indexOf(" ")+1); // str.indexOf(" ")+1 will start substring with next character and will exclude the starting point. == "Spoon"
        //str.indexOf(" ") == " Spoon"
        System.out.println("secondWord = " + secondWord);//secondWord = Spoon


        //StringIndexOutOfBoundsException
        //String r = str.substring(10, 0);<-  if the ending index is smaller than beginning index it will OutOfBoundsException
        // System.out.println( r);//StringIndexOutOfBoundsException
        // Also will give OutOfBoundException if index given not in  the range of the String== meaning the length of the string is 12 and you give index 13 or 16 == OutOfBoundException
       // String m = str.substring(5, 25);
        //System.out.println(m);//StringIndexOutOfBoundsException





    }
}
