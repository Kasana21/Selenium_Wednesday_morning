package week05_CustomMethods_ForLoop;

public class MethodPractice_Void {
    public static void main(String[] args) {
       //double result= calculate(10.5, '/', 20.5); cant be assigned only called, because of void method
       // System.out.println(calculate((10.5,'+',5.5)));cant because void
        calculate(10.5, '/', 20.5);//Division: 0.5121951219512195

        calculate(20,'/' , 0);//20.0can not be divided by zero

        calculate(10, '/', 2);//Division: 5.0
        calculate(30, '#', 40);//Invalid Math operator

        System.out.println("========================");
        //calculate(100,'+',200)*5;
    }
    public static void calculate(double num1, char mathOperator, double num2) {
//This method takes three arguments(2double and one char) and calculates the given two numbers
        if(num1<0 || num2<0){// if both numbers are not positive . if numbers are negative it exits a method
            System.out.println("Both "+num1+" and "+num2+" are not positive");
            return;
        }



        switch(mathOperator){
            case '-':
                System.out.println("Subtraction: "+ (num1-num2));
                break;
            case '+':
                System.out.println("Addition: "+ (num1+num2 ));
                break;
            case '*':
                System.out.println("Multiplication: "+ (num1*num2));
                break;
            case '/':
                if (num2 != 0) {// like in math, cant divide by zero
                    System.out.println("Division: "+(num1/num2));
                }else {
                    System.out.println(num1+"can not be divided by zero");
                }

                break;

            default:
                System.out.println("Invalid Math operator");

        }
        System.out.println("Hello World");

    }
}


/*
Tasks
    1. Create a method named calculate that accespt three arguments:
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