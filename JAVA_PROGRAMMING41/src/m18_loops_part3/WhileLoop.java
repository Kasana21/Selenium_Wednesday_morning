package m18_loops_part3;

public class WhileLoop {
    public static void main(String[] args) {
        for (int i = 0; i < 11; i++) {
            System.out.print(i + " ");
        }
        System.out.println();

        System.out.println("========================================");
        int j = 0;
        while(j<11){
            System.out.print(j+" ");
            j++;
        }
        System.out.println();
    }
}
