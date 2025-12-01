package week05;

public class ZombieAttack {
    public static void main(String[] args) {
        int population = 20;
        int day = 0;

        while (population > 0) {
            System.out.println("Day " + day + " [" + population + "]");
            population /= 2;
            day++;
        }
        System.out.println("---- EXTINCT ----");
    }
}