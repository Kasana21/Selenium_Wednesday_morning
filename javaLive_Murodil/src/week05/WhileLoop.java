package week05;

public class WhileLoop {
    public static void main(String[] args) {
        int i = 1;
        while (i <= 5) {
            System.out.println(i);
            i++;
        }
        System.out.println("After while loop - i = "+i);

        //💰Saving Until You Reach $100
        int savings = 0;
        int days = 0;
        while(savings < 100) {
            savings += 10;
            days++;
            System.out.println("Day - " + days + " Savings - $" + savings);
        }

        System.out.println("We have saved $" + savings + " in " + days + " days");

        //⏭Two pointer technique:
        int a = 0;
        int j = 20;
        while (a != j) {
            System.out.println("a = " + a + " j = " + j);
            a++;
            j--;
        }
        System.out.println("After loop a = " + a + " j = " + j);

        //📖Reading Pages Until Book Ends
        int pagesLeft = 10;
        while (pagesLeft > 0) {
            pagesLeft -= 2;
            System.out.println("Pages left " + pagesLeft);
        }
        System.out.println("Book finished!");

    }
}