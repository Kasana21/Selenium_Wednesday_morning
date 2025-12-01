package m10_variables_data_types;

public class FloatingPoints {
    public static void main(String[] args) {
        float maxFloat = 3.14F;//proper way to declare it because by default it take as double

        System.out.println(maxFloat);

        //double maxDouble;
        //double maxDouble = 3.14; // local variable be initialized like below otherwise gives compiler error, every variable must be unique. if using same then its reassigning it

        double maxDouble = 3.14;
        System.out.println(maxDouble);
    }
}
