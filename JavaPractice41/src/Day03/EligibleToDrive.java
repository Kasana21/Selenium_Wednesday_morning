package Day03;

public class EligibleToDrive {
    public static void main(String[] args) {


        boolean hasLearningPermit = true;
        boolean hasDriverLicense = false;

        double MikeAge = 15.5;
        double MaryAge = 17.0;

        boolean result = (MikeAge >= 17 && hasDriverLicense) || (MikeAge >= 15.5 && hasLearningPermit);
        boolean result2 = (MaryAge  >= 17 && hasDriverLicense) || (MaryAge  >= 15.5 && hasLearningPermit);

        System.out.println("Is Mike eligible to drive? " +result);//true
        System.out.println("Is Mary eligible to drive? " +result2);//true
    }
}
