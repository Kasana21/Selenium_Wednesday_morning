package week05;

public class NestedLoop {
    public static void main(String[] args) {
        //🔁 Multiplication Table (1 to 10)
        for (int i = 1; i <= 10; i++) {
            for (int j = 1; j <= 10; j++) {
                System.out.println(i + " x " + j + " = " + (i * j));
            }
            System.out.println("---------");
        }

        //clock:
        for (int hour = 0; hour <= 23; hour++) {
            for (int minute = 0; minute <= 59; minute++) {
                for (int second = 0; second <= 59; second++) {
                    System.out.println("Time is " + hour + ":" + minute + ":" + second);
                }
            }
        }

        //⌛ Show Days and Hours
        for (int days = 1; days <= 7; days++) {
            //24 hours:
            for (int hours = 0; hours <= 23; hours++) {
                System.out.println("Day: " + days + " Hour: " + hours);
            }
        }
    }
}