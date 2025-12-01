package m16_loops_part1;

public class DifferentStartAndEnd {
    public static void main(String[] args) {

     // Print the numbers which start from 5 and end at 20(inclusive) in the same line with space betwwn the numbers
        for (int i = 5; i <21 ; i++) {
            System.out.print(i+ " ");
        }
        System.out.println("");
        System.out.println("=====================================");
        // Print the numbers which start from 20 and endsat 10(exclusive)
        for (int i = 20; i >10 ; i--) {
            System.out.print(i + " ");
        }
        System.out.println("");
        System.out.println("=====================================");
        //Print the numbers which start from 10 and ends at 100(inclusive) with increment of 10
        for (int i = 10; i <=100 ; i+=10) {
            System.out.print(i +" ");
        }
        System.out.println("");
        System.out.println("=====================================");

        //Print the numbers which start from 50 end ends at 10(exclusive) with a decrement of 4
//!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!
        for (int i = 50; i >10 ; i-=4) {
            System.out.print(i +" ");
        }
        System.out.println("");
        System.out.println("=====================================");

        //Print "Hello" five times
        for (int i = 0; i<5; i++){
            System.out.print("Hello ");
        }
        System.out.println("");
        for (int i = 5; i < 10 ; i++) {
            System.out.println("Hello");
        }
    }
}
