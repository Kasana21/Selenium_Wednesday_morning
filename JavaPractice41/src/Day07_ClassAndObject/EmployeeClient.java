package Day07_ClassAndObject;

public class EmployeeClient {
    public static void main(String[] args) {
        Employee employee1 = new Employee();
        employee1.name = "James Bond";
        employee1.age = 45;
        employee1.gender = 'M';
        employee1.jobTitle = "Secret Agent";
        employee1.salary = 1_000_000;

        System.out.println(employee1);
        employee1.work();

        Employee employee2 = new Employee();
        employee2.age = 33;
        employee2.name= "Oksana Reha";
        employee2.gender = 'F';
        employee2.salary = 105_000;
        employee2.jobTitle = "SDET";

        System.out.println(employee2);
        employee2.work();

        Employee employee3 = new Employee();
        System.out.println(employee3);
        employee3.age = 43;
        employee3.name= "Anna Smith";
        employee3.gender = 'F';
        employee3.salary = 105_000_000;
        employee3.jobTitle = "CEO";

        System.out.println(employee3);
        employee3.work();
    }
}
