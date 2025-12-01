package m14_selection_statements_part1;

public class Salary_NestedIf {
    public static void main(String[] args) {
        int salary = 20000;
        int yearsOnJob = 1;
        if (salary >= 30000) {//true

            if (yearsOnJob >= 2){
            System.out.println("You are qualified for the loan.");
            } else {
               System.out.println("You are not qualified for the loan yet.");
            }
        }else{
                System.out.println("You must earn at least $30,000 per year");
            }
        }
    }

