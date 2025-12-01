package Day04Statements;

public class SwitchStatement_AppleDellHP {
    public static void main(String[] args) {

        String laptopModel = "razer";

        switch (laptopModel){
            case "apple":
                System.out.println("Apple - no virus");
                break;
            case "dell":
                System.out.println("Tough one");
                break;
            case "hp":
                System.out.println("Not recommended");
                break;
            default:
                System.out.println("Do not buy that one!");

        }
    }
}
