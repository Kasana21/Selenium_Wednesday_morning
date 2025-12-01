package week04;

public class MultiBranchIf {
    public static void main(String[] args) {
        //🥇 Identify medal:
        int rank = 33;
        if (rank == 1) {
            System.out.println("Gold");
        } else if (rank == 2) {
            System.out.println("Silver");
        } else if (rank == 3) {
            System.out.println("Bronze");
        } else {
            System.out.println("No medal, try again next time. Your rank - " + rank);
        }

        String status = (rank == 1) ? "Gold" : (rank == 2) ? "Silver" : (rank == 3) ? "Bronze" : "No medal, try again next time";
        System.out.println("status = " + status);

        System.out.println("--------------");
        //🍽️ Meal Recommendation Based on Time
        int hour = 23;
        if (hour >= 6 && hour <= 10) {
            System.out.println("Breakfast time");
        } else if (hour >= 11 && hour <= 14) {
            System.out.println("Lunch time");
        } else if (hour >= 15 && hour <= 17) {
            System.out.println("Snack time");
        } else if (hour >= 18 && hour <= 21) {
            System.out.println("Dinner time");
        } else {
            System.out.println("Kitchen is closed");
        }
    }
}