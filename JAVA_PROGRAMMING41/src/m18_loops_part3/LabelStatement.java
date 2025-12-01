package m18_loops_part3;

public class LabelStatement {
    public static void main(String[] args) {
       outher:
        for (int j = 1; j < 6; j++) {
            System.out.print(j +" : ");
            inner:
            for (char i = 'A'; i < 'E'; i++) {
                if (j == 3){
                    break outher;//terminates the outer loop
                }
                System.out.print(i + " ");
            }
            System.out.println();
            // 1 : A B C D
            // 2 : A B C D
            // 3 :
        }
        /*
        outher:
        for (int j = 1; j < 6; j++) {
            System.out.print(j +" : ");
            inner:
            for (char i = 'A'; i < 'E'; i++) {
                if (j == 3){
                    break inner ;
                }
                System.out.print(i + " ");
            }
            System.out.println();
         // same outcome with break;
           // 1 : A B C D
           // 2 : A B C D
            //3 :
           // 4 : A B C D
           // 5 : A B C D


        }
  */

    }
}
