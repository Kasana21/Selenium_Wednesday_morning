package m18_loops_part3;

public class BranchingStatementsIntro {
    public static void main(String[] args) {
        for (char i = 'A'; i <'E' ; i++) {
            if (i == 'C'){
                break;//exits current loop
            }
            System.out.println(i);
        }

        System.out.println("============================");
        for (int i = 1; i < 6; i++) {
            if (i==3){
                continue;
            }
            System.out.println(i);
        }

    }
}
