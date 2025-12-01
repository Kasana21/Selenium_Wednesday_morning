package week03;

public class ComparisonOperators {
    public static void main(String[] args) {
        int testScore = 85;
        int passMark = 50;
        System.out.println(testScore > passMark);
        boolean passed = testScore > passMark;
        System.out.println("Did you pass? - " + passed);

        //Check if the room temperature is below freezing:
        int temperature = -2;
        System.out.println(temperature < 0);
        var isFreezing = temperature < 0;
        System.out.println("Is it freezing? - " + isFreezing);

        //Check if your age is enough to vote (18 or older):
        int age = 18;
        boolean canVote = age >= 18;
        System.out.println("canVote = " + canVote);

        //Check if luggage weight is within 23kg airline limit:
        int luggageWeight = 23;
        int airlineLimit = 23;
        boolean isWithinLimit = luggageWeight <= airlineLimit;
        System.out.println("isWithinLimit = " + isWithinLimit);

        //Check if the entered PIN is correct:
        var enteredPin = 1234;
        var correctPin = 1234;
        var isCorrect = enteredPin == correctPin;
        System.out.println("isCorrect = " + isCorrect);

        //Check if a seat is not already reserved:
        int selectedSeat = 22;
        int reservedSeat = 15;
        var seatAvailable = selectedSeat != reservedSeat;
        System.out.println("seatAvailable = " + seatAvailable);
    }
}