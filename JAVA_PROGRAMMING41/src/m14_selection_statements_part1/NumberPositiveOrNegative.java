package m14_selection_statements_part1;

public class NumberPositiveOrNegative {
    public static void main(String[] args) {
        int number = 100;
/*
        if (number > 0){
            System.out.println("Positive");
        }
        if(number<0){
            System.out.println("Negative");
        }

        if (number == 0){
            System.out.println("Zero");
        }

 */



        if(number > 0){
            System.out.println("Positive");
        } else if(number<0){
            System.out.println("Negative");
        }else {
            System.out.println("Zero");
        }


    }
}
