
package week03;

public class BMICalculator {
    public static void main(String[] args) {
        double weight = 55.0;
        double height = 1.66;
        double BMI = weight / (height * height);
        //The Body Mass Index (BMI) is 33.33 kg/m2
        System.out.println("The Body Mass Index (BMI) is " + BMI + " kg/m2");
        //format BMI to 2 decimal points
        System.out.printf("The Body Mass Index (BMI) is %.2f kg/m2", BMI);
    }
}
