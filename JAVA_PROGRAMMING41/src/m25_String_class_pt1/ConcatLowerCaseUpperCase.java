package m25_String_class_pt1;

public class ConcatLowerCaseUpperCase {
    public static void main(String[] args) {
        String str = "Cydeo";
        str = str.concat("School"); //Cydeo School -- will be only if the object is updated(assigned)
        System.out.println(str);//Cydeo School
        String lowerCaseStr = str.toLowerCase();// "cydeo school"
        System.out.println("lowerCaseStr = " + lowerCaseStr);//lowerCaseStr = cydeoschool
        
        String upperCaseStr = str.toUpperCase();//CYDEOSCHOOL
        System.out.println("upperCaseStr = " + upperCaseStr);//upperCaseStr = CYDEOSCHOOL
        
    }
}
