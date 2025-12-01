package Day05ForLoops;

public class RectangleTask {
    public static void main(String[] args) {
        /*
        Rectangle Task: Create a class named Rectangle. Use a loop to print the following shape on the console:

			* * * * * * * *
			* * * * * * * *
			* * * * * * * *
			* * * * * * * *
			* * * * * * * *
			* * * * * * * *
			* * * * * * * *
			* * * * * * * *
			* * * * * * * *
         */
        int row =9;
        int column = 8;
        for (int i = 0; i < row; i++) {
            for (int j = 0; j < column ; j++) {
                System.out.print("* ");
            }
            System.out.println(); // move to next line after each row
        }

       /* int i = 0; // row counter
        while (i < row) {
            int j = 0; // column counter
            while (j < column) {
                System.out.print("* ");
                j++;
            }
            System.out.println(); // move to next line after each row
            i++;
        }*/
/*
        int i = 0; // row counter
        do {
            int j = 0; // column counter
            do {
                System.out.print("* ");
                j++;
            } while (j < column);

            System.out.println(); // move to next line after each row
            i++;
        } while (i < row);

 */


    }

}
