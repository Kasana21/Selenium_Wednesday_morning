package Day05ForLoops;

public class NumbersBetween0And10_loop {
    public static void main(String[] args) {
        for (int i = 0; i < 11; i++) {
            if (i % 2 == 0) {
                System.out.print(i + " ");
            }
        }
        System.out.println(" ");
        System.out.println("=============================");
        int j = 0;

        while (j >= 0 && j <= 10) {
            j++;
            if (j % 2 == 0) {

                System.out.print(j + " ");
            }
        }
        System.out.println("");
        System.out.println("=============================");

      /*  int k = 0;
        do {
            k++;
            System.out.print(k +" ");


        } while (k >= 0 && k <= 10);

        if (k % 2 == 0) {


        }
        System.out.println(" ");


       */


    }

    }

