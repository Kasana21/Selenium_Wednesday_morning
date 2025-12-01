package Day04Statements;

public class GraterNumber_Nested_IF_statement {
    public static void main(String[] args) {
        int num1 = 9;
        int num2 = 4;

        if(num1 != num2){
            System.out.println("Numbers are NOT equal");
            if (num1>num2){
                System.out.println("The num1 is greater than num2");
            }else if(num2>num1){
                System.out.println("The num2 is greater than num1");
            }
        }else{
            System.out.println("Numbers are equal");
        }


    }
}
