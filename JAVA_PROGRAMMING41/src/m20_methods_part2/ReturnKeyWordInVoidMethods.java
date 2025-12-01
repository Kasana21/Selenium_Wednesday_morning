package m20_methods_part2;

public class ReturnKeyWordInVoidMethods {
    public static void main(String[] args) {
        eligibleToVote(170);

    }
    public static void eligibleToVote(int age){
        if (age<18 || age>150){
            System.err.println("Invalid age: " + age);
            return;//exits the method and the rest of the code is not being executed
        }

        if (age>=18){
            System.out.println("You are eligible to vote");
        }else {
            System.out.println("You are NOT eligible to vote");
        }
    }
}
