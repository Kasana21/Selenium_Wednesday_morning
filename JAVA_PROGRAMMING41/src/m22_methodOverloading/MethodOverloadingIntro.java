package m22_methodOverloading;

public class MethodOverloadingIntro {
    public static void main(String[] args) {
        displayValue(5, 20.0);
        displayValue(2.5, (int)20.5);
        displayValue(10,(double) 10);
        displayValue((double)10,10);
    }
    public static void displayValue(int a){
        System.out.println("First Method");
    }
    public static void displayValue(double a){
        System.out.println("Second Method");
    }
    public static void displayValue(int a, double b){
        System.out.println("Third Method");
    }
    public static void displayValue(double a, int b){
        System.out.println("Forth Method");
    }
}
