package m18_loops_part3;

public class BranchingStatement_Return {
    public static void main(String[] args) {
        for (int i = 1; i < 6 ; i++) {
            if (i == 3){
               // continue;//skips (jumps to the next iteration of the loop // will return 1 2 4 5 Hello World Hello Cydeo
                //break;//exits the loop// will return 1 2 Hello World HelloCydeo
                return;//exits the method // will return 1 2 after i == 3
            }
            System.out.println(i);
        }
        System.out.println("Hello World");
        System.out.println("Hello Cydeo");
    }
}
