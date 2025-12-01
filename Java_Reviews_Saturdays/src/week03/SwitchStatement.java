package week03;

public class SwitchStatement {
    public static void main(String[] args) {
        int day=5;
        String result ="";

        switch (day){
            case 1:
                result = "Monday";
              break;
            case 2:
                result = "Tuesday";
                break;
            case 3:
                result= "Wednesday";
                break;
            case 4:
                result= "Thursday";
                break;
            case 5:
                result= "Friday";
                break;
            case 6:
                result = "Saturday";
                break;
            case 7:
                result = "Sunday";
            break;

            default:
                if(day<1){
                    result = "Minimum day number can not be less than 1";
                }else{
                    result ="Max day number can not be greater than 7";
                }
                //break in the default is optional as long its int the body of the code
                System.out.println(result);
        }

        System.out.println("=========================");
        int month =1;
        String result2  = " ";
        if (month >=1 && month<=12){
            switch (month){
                case 1:result2 = "January";
                case 2: result2= "February";

                case 3:result2 = "March";

                case 4:result2 = "april";

                case 5:result2 = "may";
                    break;
                case 6:result2 = "Jun";

                case 7:result2 = "July";

                case 8:result2 = "aug";

                case 9:result2 = "sep";

                case 10:result2 = "oct";

                case 11:result2 = "nov";

                case 12:result2 = "dec";
            }

        }else{
            System.out.println("Invalid");
        }
    }
}
