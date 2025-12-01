package m12_operators_part2;

public class LogicalComplementOperators {
    public static void main(String[] args) {
        boolean isEligible = true;
        System.out.println("isEligible = " + !isEligible);//isEligible = false

        boolean passed = true;
        System.out.println("!passed = " + !passed);//!passed = false

        boolean married = true;
        System.out.println("married = " + !married);//married = false
    }
}
