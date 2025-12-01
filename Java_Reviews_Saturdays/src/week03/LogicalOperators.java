package week03;

public class LogicalOperators {
    public static void main(String[] args) {

        // ||(or operator)
        System.out.println(true || false);//

        // && (and operator)

        // ! (not operator)
        /* if statement :conditional steatements
          single if : for one condition
          if(condition){
          statement
          }

          if & else : 2 possible conditions only(not more not less)
          if(condition){
          statement A
          }else{ // this is oposite to condition
          statement B
          }

          multi branch if: for 3 or more conditions/// allways must have order. condition==> else if
          as many as needed==>last statement is else
           if(conditionA){
           Statement A
           }else if(conditionB){
           Statement B
           }else {
           Statement C
           }
           statement will execute when:
           statementA: conditionA is true
           StatementB: conditionA is false, ConditionB is true
           StatementC: conditionA and conditionB is false

           nested if :  for pre-conditions
           A,B,C,D,F

         */


        //odd or even
       /* int num = 100;
        if(num % 2 != 0){
            System.out.println("Odd number");
        }
        if (num %2 == 0){
            System.out.println("Even Number");
        } */
        int num = 100;
        if(num % 2 != 0){
            System.out.println("Odd number");
        }else{
            System.out.println("Even Number");
        }

        System.out.println("========================");
        int month = 3;
        if(month>=1 && month <= 12) {
            if (month == 2) {
                System.out.println("28 days");
            } else if (month == 4 || month == 6 || month == 9 || month == 11) {
                System.out.println("30 Days");
            } else {
                System.out.println("31 days");
            }
        } else { // if the month is not valid
            System.out.println("invalid");
        }
            // 30 days : 4,6,9,11,

        if(month <1){
            System.out.println("minimum moth number is one");
        }else{
            System.out.println("maximum month number is 12");
        }





    }
}
