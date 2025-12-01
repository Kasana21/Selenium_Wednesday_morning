package week05_CustomMethods_ForLoop;

public class MethodPractice_Return {
    public static void main(String[] args) {
        double a = calculate(10,'+',30);
        System.out.println(a);

        System.out.println("=========================");
        double multiplication = calculate(10, '*', 20);
        System.out.println(multiplication);
        System.out.println(calculate(10,'#',3));



    }


    public static double calculate(double num1, char mathOperator, double num2){//must return value
        double result = 0;
       //this not supposed to be here //System.out.println("Hello world");if u give wrong code fragments method won't work.// /n "Hello world"/n 0.0

        switch(mathOperator){
            case '-':
                result= num1-num2;
                break;
            case'+':
               result= num1+num2;
            break;
            case '*':
                result= num1*num2;
            break;
            case '/':
                if (num2!=0) {// always give this condition because cant be divided by zero
                   result= num1 / num2;
                }
            break;
            default:
                System.out.println("Invalid math operator");
               /* System.err.println("Invalid Operator");//if u want to show error message
                System.exit(1);//terminates the program when there is an error. AND EVERYTHING WILL  STOP
                //because on console must be "exit code 0". but if there is an error it stops */
        }
        return result;
    }
}
/*
Tasks
    1. Create a method named calculate that accepts three arguments:
            1. num1 (double)
            2. operator (char)
            3. num2 (double)
        if the operator is +:
                the method should return the addition of the two numbers
        if the operator is -:
                the method should return the subtraction of the two numbers
        if the operator is *:
                the method should return the multiplication of the two numbers
        If the operator is /:
                if denominator is NOT zero:
                    then the method should return the division
        for any other operators, the method should return 0
 */