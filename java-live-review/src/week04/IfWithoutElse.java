package week04;

public class IfWithoutElse {
    public static void main(String[] args) {
        //we go out if sunny
        boolean sunny = true;
        if (sunny){
            System.out.println("Let's put on sunglasses and go out");
        }
        System.out.println("After sunny check");
        System.out.println("==================================================");
        // if battery level is low and show a warning"
        int batteryLevel = 15;
        if (batteryLevel<20){
            System.out.println("Battery low!");
            System.out.println("Consider charging soon");
        }
        System.out.println("==================================================");

        boolean isCloudy = true;
        boolean isCold = true;

        if (isCold && isCloudy){
            System.out.println("Take a jacket!");
        }


    }
}
