package week02;

public class ParisOlympics {
    public static void main(String[] args) {
        System.out.println("\t\t\t\t\tPARIS 2024");
        System.out.println("\t\t\t\t\tMEDAL TABLE");

        int rank = 1 ;
        String flag ="\uD83C\uDDFA\uD83C\uDDF8";
        String country = "United States";
        int gold =40, silver = 44 , bronze = 42;
        int total = gold + silver + bronze ;

        System.out.println("Team\t\t\t\tGold\tSilver\tBronze\tTotal");
        System.out.println(rank + " " + flag + " " + country + "\t" + gold + "\t\t" + silver+ "\t\t" + bronze + "\t\t" + total);

        rank = 2;
        flag = "\uD83C\uDDE8\uD83C\uDDF3";
        gold =40;
        silver =27;
        bronze = 24;
        total = gold + silver + bronze;
        System.out.println(rank + " " + flag + " " + country + "\t" + gold + "\t\t" + silver+ "\t\t" + bronze + "\t\t" + total);



    }
}
