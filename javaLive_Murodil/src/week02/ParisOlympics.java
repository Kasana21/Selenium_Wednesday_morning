package week02;

public class ParisOlympics {
    public static void main(String[] args) {
        System.out.println("\t\tPARIS 2024");
        System.out.println("\t\tMEDAL TABLE\n");

        int rank = 1;
        String flag = "\uD83C\uDDFA\uD83C\uDDF8";
        String country = "United States";
        int gold = 40, silver = 44, bronze = 42;
        int total = gold + silver + bronze;

        System.out.println("Team\t\t\t\tGold\tSilver\tBronze\tTotal");
        System.out.println(rank + " " + flag + " " + country + "\t" + gold + "\t\t" + silver + "\t\t" + bronze + "\t\t" + total);

        //update values for China
        rank = 2;
        flag = "\uD83C\uDDE8\uD83C\uDDF3";
        country = "China";
        gold = 40;
        silver = 27;
        bronze = 24;
        total = gold + silver + bronze;

        System.out.println(rank + " " + flag + " " + country + "\t\t\t" + gold + "\t\t" + silver + "\t\t" + bronze + "\t\t" + total);

        //update values for Great Britain
        rank = 3;
        flag = "\uD83C\uDDEC\uD83C\uDDE7";
        country = "Great Britain";
        gold = 14;
        silver = 22;
        bronze = 29;
        total = gold + silver + bronze;

        System.out.println(rank + " " + flag + " " + country + "\t" + gold + "\t\t" + silver + "\t\t" + bronze + "\t\t" + total);

    }
}