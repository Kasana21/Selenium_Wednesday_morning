package m15_selection_statments_part2;

public class TernaryNumber {
    public static void main(String[] args) {
       int num = -100;
        //if statement
       /* String result:
        if (num>0){
            result = "positive";
        }else if(num < 0){
            result = "negative";
        } else{
            result = "zero";
        }
        System.out.println(result);
        */
        String result = (num > 0) ? "Positive": (num < 0) ? "Negative" : "Zero";
        System.out.println("Number is: " + result);

    }
}
