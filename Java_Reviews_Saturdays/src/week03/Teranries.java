package week03;

public class Teranries {
    public static void main(String[] args) {
        /*
        ternaries : shortcut  og the statements
        ? if keyword
        (condition)?value
        : else keyword
        valur
        ?: else if
        :(condition)?value
        total of ? and : must be even
         */

        int day = -200;
        String result = "";
       /* if (day >= 1 && day <= 7) {// 7 possible outputs
            result=(day ==1)?"Monday":(day == 2)?"Tuesday":(day== 3)?"Wednesday"
                    :(day == 4)?"Thursday":(day == 5)?"Friday":(day==6)?"Saturday":"Sunday"

        }else{
            result = (day<1)?"Minimum day number can not be less than 1"
                    :"Maximum day number canot be greater than 7"
        }
        */
       result = (day >= 1 && day<=7)?
               (day ==1)?"Monday":(day == 2)?"Tuesday":(day== 3)?"Wednesday"
                       :(day == 4)?"Thursday":(day == 5)?"Friday":(day==6)?"Saturday":"Sunday"
               :"Invalid";

        System.out.println(result);
    }
}
