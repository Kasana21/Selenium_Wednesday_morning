
package week03;

public class LogicalOperators {
    public static void main(String[] args) {
        //Check if you can unlock a device (must know password and have fingerprint):
        boolean knowsPassword = true;
        boolean hasFingerprint = true;
        System.out.println("Unlocked? - " + (knowsPassword && hasFingerprint));
        boolean unlocked = knowsPassword && hasFingerprint;
        System.out.println("unlocked = " + unlocked);

        //Check if you can get a discount (if you're a student OR a senior):
        boolean isStudent = false;
        boolean isSenior = true;
        boolean hasDiscount = isStudent || isSenior;
        System.out.println("hasDiscount = " + hasDiscount);

        boolean sunny = true;
        System.out.println("Cloudy day? - " + !sunny);
    }
}
