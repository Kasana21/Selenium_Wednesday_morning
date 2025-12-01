package m20_methods_part2;

public class EmployeeInfo {
    public static void main(String[] args) {
        displayEmployeeInfo("James", 21, "New York");

        System.out.println("===============================");

        String name ="Isabella";
        int age = 26;
        String city = "Los Angeles";

        displayEmployeeInfo(name,age,city);

    }
    public static void displayEmployeeInfo(String name, int age, String city){
        System.out.println("Employee name is "+ name);
        System.out.println(name + " is " + age + " years old");
        System.out.println(name+" is from "+city);
    }
}
