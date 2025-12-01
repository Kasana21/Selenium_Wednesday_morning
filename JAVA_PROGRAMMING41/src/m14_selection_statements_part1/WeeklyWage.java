package m14_selection_statements_part1;

public class WeeklyWage {
    public static void main(String[] args) {
        double wage = 900;
        int hours  = 25;
        if(hours > 40){
            wage *= 1.5;
        }
        System.out.println("wage = " + wage);

    }
}
