package Day05ForLoops;

public class OddNumbersForLoop {
    public static void main(String[] args) {
        //Print the odd numbers between 1 (inclusive) and 19 (inclusive) in the same line with a dash between the numbers
        for (int i = 1; i <= 19; i+=1){
            System.out.print(i++ + "-");
        }
    }
}
