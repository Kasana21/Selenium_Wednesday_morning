package m15_selection_statments_part2;

public class SwitchWithLambdaArrow {
    public static void main(String[] args) {
        int n = 1;
        //1.if used lambda arrow no need to use break statement
        //2.if there is going to be one code fragment in the case blocks body then no need for { }
        //3.if using lambda arrow then it needs to be the same for the rest of case blocks
        switch (n){
            case 1 -> {
                System.out.println("Monday");
                System.out.println("WeekDay01");//2. just like here
            }
            case 2 ->System.out.println("Tuesday");

            case 3 ->System.out.println("Wednesday");

            case 4 ->System.out.println("Thursday");

            case 5 ->System.out.println("Friday");

            case 6, 7 ->System.out.println("Weekend");


            default ->System.out.println("Invalid day");

        }
    }
}
