package m18_loops_part3;

public class DoWhileLoop {
    public static void main(String[] args) {
        int n =100;
        while (n<0){//false
            System.out.println("While Loop: Hello World");// doesnt print anything
        }
        System.out.println("=====================================");
        do {
            System.out.println("Do-While Loop: Hello World");//prints once even if its false
        }while (n<0);//false
        System.out.println("=====================================");
        int i = 0;
        do {
            System.out.println(i + " ");// print 1 to 10
            i++;
        }while(i< 11);
    }
}
