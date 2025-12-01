package m21_methods_par3;

public class ReturnMethodPractice {
    public static void main(String[] args) {

      double result =   calculate(20.5, '#', 2);
        System.out.println(result);
    }
    public static double calculate(double num1, char mathOperator, double num2){
        boolean validOperator = mathOperator == '+' || mathOperator == '-' || mathOperator== '*' || mathOperator == '/' || mathOperator == '%';
        if (!validOperator){
            return 0;
        }
        double result = (mathOperator == '+')? num1 + num2:(mathOperator == '-')? num1-num2: (mathOperator == '*') ? num1 * num2 : (mathOperator =='/') ? num1/num2: num1%num2;
        return result;
    }
}
