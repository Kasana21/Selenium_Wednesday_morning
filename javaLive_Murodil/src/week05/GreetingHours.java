package week05;

public class GreetingHours {
    public static void main(String[] args) {
        for (int hour = 0; hour <= 23; hour++) {
            if (hour >= 5 && hour <= 11) {
                System.out.println("Good Morning - " + hour);
            } else if (hour >= 12 && hour <= 17) {
                System.out.println("Good Afternoon - " + hour);
            } else if ((hour >= 18 && hour <= 23) || (hour >= 0 && hour <= 4)) {
                System.out.println("Good Evening - " + hour);
            } else {
                System.out.println("Invalid hour - " + hour);
            }
        }

        System.out.println("-----Switch statement------");
        for (int hour = 0; hour <= 23; hour++) {
            switch (hour) {
                case 5,6,7,8,9,10,11 -> System.out.println("Good Morning - " + hour);
                case 12,13,14,15,16,17 -> System.out.println("Good Afternoon - " + hour);
                case 18,19,20,21,22,23,0,1,2,3,4 -> System.out.println("Good Evening - " + hour);
                default -> System.out.println("Invalid hour - " + hour);
            }
        }
    }
}