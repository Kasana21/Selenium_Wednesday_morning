package week02;

public class WholeNumbers {
    public static void main(String[] args) {
        int students;
        students = 128;
        System.out.println(students);

        students = 150;
        System.out.println(students);

        int teachers = 5;
        System.out.println(teachers);

        teachers = 15;
        System.out.println(teachers);

        System.out.println("------------");

        byte age = 25;
        short year = 2025;
        int population = 100_000;
        long distance = 15000000000L;

        System.out.println(age);
        System.out.println(year);
        System.out.println(population);
        System.out.println(distance);

        System.out.println("-------------");

        long originalTicketNumber = 9876543210L;
        long backUpTicketNumber = originalTicketNumber;

        System.out.println(originalTicketNumber);
        System.out.println(backUpTicketNumber);

        System.out.println("-----------------");

        int count = 31;
        int bananas = count;
        System.out.println("count of bananas = " + bananas);
    }
}