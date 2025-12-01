package week04;

public class SwitchStatement {
    public static void main(String[] args) {
        //🎮 Game Menu Option:
        int option = 1;
        switch (option) {
            case 1 -> System.out.println("Start New Game");
            case 2 -> System.out.println("Resume Game");
            case 3 -> System.out.println("Exit");
            default -> System.out.println("Invalid option - " + option);
        }

        //🏢 Companies directory:
        System.out.println("-----------");
        int floor = 4;
        String companies;
        switch (floor) {
            case 1 -> companies = "Cydeo, InfoSys, Haxaware";
            case 2 -> companies = "Meta, HP, Starlink";
            case 3 -> companies = "Amazon, Etsy, Ebay";
            case 4 -> companies = "OpenAI, Grok, Perplexity";
            default -> companies = "Invalid floor";
        }
        System.out.println(floor + " -> companies: " + companies);
    }
}