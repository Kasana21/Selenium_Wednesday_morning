package m14_selection_statements_part1;

public class Watermelon {
    public static void main(String[] args) {
        int number = 40;
        boolean isEnough =false;
        if (number >= 20 ){//true
            System.out.println("I have more than 20 watermelons");
            isEnough = true;//isEnough ===> true
        }

        if (isEnough){//true
            System.out.println("Good job");
        }

        if (!isEnough){
            System.out.println("I need more watermelon");
        }



            }
}
