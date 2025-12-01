package m15_selection_statments_part2;

public class Calculator_SwitchStatement {
    public static void main(String[] args) {
        double num1 = 100;
        double num2 = 20;

        char operator='/';
        switch(operator){
            case '+':
                System.out.println("Addition: " + (num1 + num2));
                break;
            case '-':
                System.out.println("Subtraction: " + (num1 - num2));
                break;
            case '*':
                System.out.println("Multiplication: " + (num1 * num2));
                break;
            case '/':
                System.out.println("Division: " + (num1 / num2));
                break;
            default: //default block dont need break statement in the end
            //IF default is placed somewhere else need the break statement
                System.out.println("Invalid operator");

        }

    }
}
