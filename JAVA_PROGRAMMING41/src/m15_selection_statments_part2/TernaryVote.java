package m15_selection_statments_part2;

public class TernaryVote {
    public static void main(String[] args) {
        int age =28;
        /*  String result;
      if (age>=18){
            result = "You are eligible to vote";
        }else{
            result = "You are not eligible to vote";
        }
        System.out.println(result);
        */
        String result = (age >= 18) ? "You are eligible to vote" : "You are not eligible to vote";
        System.out.println(result);

    }
}
