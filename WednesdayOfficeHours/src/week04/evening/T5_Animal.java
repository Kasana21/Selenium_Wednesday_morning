package week04.evening;

public class T5_Animal {
    public static void main(String[] args) {
        /*Task 5: Create  a program that accepts animal as String
                            DOG     - domestic animal
                            CAT     - domestic animal
                            TIGER     - wild  animal
                            For other animal - unknown animal
                            INPUT : DOG         EXPECTED OUTPUT : DOG is domestic animal
         */
        String animal="Cat";

        switch (animal){//java is case sensetive language
            //in switch we are looking for match(important. must match every single character
            case"Dog":
            case"Cat":
                System.out.println(animal+" is domestic animal");
                break;
            case "Tiger":
                    System.out.println(animal+" is a wild animal");
                    break;
            default:
                System.out.println(animal + " is not known");

        }

    }
}
