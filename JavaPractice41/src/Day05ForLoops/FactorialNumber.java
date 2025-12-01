package Day05ForLoops;

public class FactorialNumber {
    public static void main(String[] args) {
        /*
        FactorialNumber Task: Create a class named FactorialNumber. Write a program that can return the factorial number of any given number.
				Example:
					  num = 5
				Output:
					  120
			(because: 5! = 5 * 4 * 3 * 2* 1 = 120 )
         */

        int num = 5;
        int factorial = 1;
       /* for (int i = 1; i <= num ; i++) {
            factorial *= i;
        }
        System.out.println("Factorial number: "+factorial);
        */
        while(num>1){//doesn't include one because multiplying by 1 doesnt give differen result
           factorial *= num--;//factorial = factorial * num
                              // num--;
        }
        System.out.println(factorial);
    }
}
