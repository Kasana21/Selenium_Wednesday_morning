package m14_selection_statements_part1;

public class Grading {
    public static void main(String[] args) {
        int score = 100;

        String result;

        if (score >= 0 && score<=100) {
            if(score>= 90) {
                result ="Passed with Distinction";
            } else if (score>=60) {
               result = "Pass";
            }else {
                result ="Fail";
            }


        }else {
            result ="Invalid sore";
        }
        System.out.println(result);




        //tried myself
       /* if (score < 60 ){
            System.out.println("Fail");
            if (score >= 60 && score < 90){
                System.out.println("Pass");
            } else if (score>= 90) {
                System.out.println("Passed with Distinction");
            }else{

            }

        */

        }
    }

