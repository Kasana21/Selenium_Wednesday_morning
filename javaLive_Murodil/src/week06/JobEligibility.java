package week06;

public class JobEligibility {
    public static void main(String[] args) {
        //call repeatWord here
        VoidMethods.repeatWord("Java", 3);

        checkJobEligibility(45, 10);
        checkJobEligibility(25, 1);
    }

    public static void checkJobEligibility(int age, int experience) {
        if (age >= 21 && experience >= 2) {
            eligible();
        } else {
            inEligible();
        }
    }

    public static void eligible() {
        System.out.println("Eligible for job");
    }

    public static void inEligible() {
        System.out.println("Not eligible for this job");
    }
}