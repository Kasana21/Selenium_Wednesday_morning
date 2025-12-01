package week04;

public class IfElse {
    public static void main(String[] args) {
        //Check hungry
        boolean hungry = true;
        if (hungry){
            System.out.println("Lets get some snacks first");
            System.out.println("Keep coding java");
        }else {
            System.out.println("Not hungry, lets keep coding java ");
        }
        System.out.println("--------------");
        //😷 Check if pandemic lockdown:
        int year = 2025;
        if (year == 2020 || year == 2021) {
            System.out.println("Lockdown - " + year);
            System.out.println("wear mask, stay home , keep coding java");
        } else {
            System.out.println("Go out, meet friends");
            System.out.println("Keep coding java");
        }

        System.out.println("=================================================");
        //🚪 Check if a shop is open or closed:
        int hour = 21;
        String message;
        if (hour < 22) {
            message = "Shop is open";
        } else {
            message = "Shop is closed";
        }
        System.out.println(message + " at hour " + hour);

        System.out.println("=================================================");
        //🧑‍🎓 Check if a student passed or failed a test:
        int score = 85;
        int passingScore = 50;
        if (score >= passingScore) {
            System.out.println("Passed");
        } else {
            System.out.println("Failed");
        }
        System.out.println("=================================================");







    }
}
