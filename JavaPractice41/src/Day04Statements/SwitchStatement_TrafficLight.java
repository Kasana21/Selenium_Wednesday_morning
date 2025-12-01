package Day04Statements;

public class SwitchStatement_TrafficLight {
    public static void main(String[] args) {

        String trafficLight = "G";

        switch (trafficLight){
            case "R":
            case "r":
                System.out.println("Red");
                break;
            case "Y":
            case "y":
                System.out.println("Yellow");
                break;
            case "G":
            case "g":
                System.out.println("Green");
                break;

            default:
                System.out.println("Invalid color");

        }

    }
}
