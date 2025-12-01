package m18_loops_part3;

public class whileLoop_SumOfEvenNumbers {
    public static void main(String[] args) {
        //Write a program that calculates the sum of even numbers between 1 to 10 while loop
        int num = 1;
        int sumEven = 0;

        while (num<11){
            System.out.println(num+" ");
            num++;
            if(num % 2 == 0){
                sumEven = sumEven + num;
            }

        }
        System.out.println("Sum of even numbers: "+sumEven);

        //For Loop Solution
        int sumEven1=0;
        for (int i = 0; i < 11 ; i++) {
            if (i%2 == 0){
                sumEven1+=i;
            }
        }
        System.out.println(sumEven1);
    }
}
