package m18_loops_part3;

public class DoWhileLoop_FinraPattern {
    public static void main(String[] args) {
        /*Write a programUsing "do-while loop"that generates and prints theFINRA pattern up to given number
        The FINRA pattern is a sequence of numbers where certain numbers are replaced with specific words, The patterns follows these rules:
        - Numbers divisible by 3 are replaced withh "FIN"
        - Numbers divisible by 5 are replaced qwith "RA"
        -Numbers divisible by both 3 and 5 are replaced with "FINRA"
        -All other number remain unchanged
        Example :
        Input: 20
        Output: 1 2 FIN 4 RA FIN 7 8 FIN RA 11 FIN 13 14 FINRA 16 17 FIN 19 RA
         */
        int num = 20;
        int n = 1;
        do {
            if (n % 3 == 0 && n % 5 == 0) {
                System.out.print("FINRA");
            } else if (n % 3 == 0) {
                System.out.print("FIN ");
            } else if (n % 5 == 0) {
                System.out.print("RA ");
            } else {
                System.out.print(num + " ");
            }
            n++;

        } while (n <= num) ;


    }
}
