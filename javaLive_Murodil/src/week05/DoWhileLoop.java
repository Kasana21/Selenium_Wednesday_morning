package week05;

public class DoWhileLoop {
    public static void main(String[] args) {
        //🔁 Print Numbers 1 to 5
        int i = 10;
        do {
            System.out.println(i);
            i++;
        } while (i <= 5);

        System.out.println("After loop - " + i);

        //🍽️ Eating Until Full (Minimum One Bite)
        int bites = 0;
        do {
            bites++;
            System.out.println("Taking a bite = " + bites);
        } while (bites < 3);
        System.out.println("Feeling full, cannot eat any more");

    }
}