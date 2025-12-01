package Day04Statements;

public class If_statementVriablesTask2 {
    public static void main(String[] args) {
        int a = 10;
        int b = 5;
        int c = 7;

        if (a < 10){
            b = 1;
        } else if (a > 10) {
            c = 1;
        }else {
            b = 0;
            c = 0;
        }

        System.out.println(a);
        System.out.println(b);
        System.out.println(c);



    }
}
