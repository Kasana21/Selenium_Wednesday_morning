package m19_methods_part1;

public class MethodsIntro {
    public static void main(String[] args) {
        System.out.println("Test started");
        eat();
        walk();
        play();
        //MethodsIntro.play();// no need to call it through the class name within class
        System.out.println("Test completed");
    }
    public static void eat(){
        System.out.println("I am eating.");
    }
    public static void walk(){
        System.out.println("I am walking.");
    }
    public static void play(){
        walk(); // I am walking
        System.out.println("I am playing.");
    }


}
