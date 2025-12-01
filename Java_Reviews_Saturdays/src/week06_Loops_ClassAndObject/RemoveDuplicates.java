package week06_Loops_ClassAndObject;

public class RemoveDuplicates {
    public static void main(String[] args) {
        String str = "XXXYYYZZ";//its immutable string
        String result = "";

        for (int i = 0; i < str.length(); i++) {
            if(result.contains(str.charAt(i)+"")){
                continue;
            }
            //result placed outside the for loop because of the order of reading
           result+= str.charAt(i);//u get every single character 
        }
        //print statement must be placed outside the loop,
        // because inside, of the loop we place everything that must be repeated
        System.out.println("result = " + result);//result = XXXYYYZZ(without contains method)
        //result = XYZ wanted result. printed when used .contains => continue statement
    }

}
/*
//XYZ "
 */