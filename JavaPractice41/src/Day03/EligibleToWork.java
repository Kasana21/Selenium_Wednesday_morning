package Day03;

public class EligibleToWork {
    public static void main(String[] args) {
        int age = 2025 - 1985;
        boolean isEligible = age >=18 && age <=65;
        System.out.println("Am I eligible to work? " + isEligible);


         age = 2025 -  1957;
        isEligible = age >=18 && age <=65;
        System.out.println("Am I eligible to work? " + isEligible);


         age = 2025 -2014;
       isEligible = age >=18 && age <=65;
        System.out.println("Am I eligible to work? " + isEligible);

        age = 2025 -2001;
        isEligible = age >=18 && age <=65;
        System.out.println("Am I eligible to work? " + isEligible);

    }
}
