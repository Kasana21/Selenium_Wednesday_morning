package Day04Statements;

public class CalculatorTaskSwitch {
    public static void main(String[] args) {
        /*
        Calculator Task: Create a class called Calculator. Given two double variables named n1 and n2 and a char
variable named mathOperator, write a program that calculates the result of n1 and n2 based on
the given math operator.

		char operator -> -, +, *, /

		When the operator is +: add n1, n2
		When the operator is -: subtract n1, n2
		When the operator is *: multiply n1, n2
		When the operator is /: divide n1, n2
		For any other operators, print "invalid operator."

            Example:
                  n1 = 10, n2 = 20, mathOperator = '+'

            Output:
                  30
         */

        double n1 =10;
        double n2 = 20;
        char mathOperator = '+';

        String result ;
       /* switch (mathOperator){
            case '+':
                result = "" +(n1+n2);
                break;
                case '-':
                    result = "" + (n1-n2);
                    break;
            case '*':
                result = ""+ (n1*n2);
                break;
            case '/':
           result=""+(n1/n2);
                break;
            default:
                result ="Invalid operator";
        }
        System.out.println(result);
        */
        switch (mathOperator){
            case '+':
                System.out.println(n1+n2);
                break;
            case '-':
                System.out.println(n1-n2);
                break;
            case '*':
                System.out.println(n1*n2);
                break;
            case '/':
                System.out.println(n1/n2);
                break;
            default:
                System.out.println("Invalid operator");
        }

    }
}
