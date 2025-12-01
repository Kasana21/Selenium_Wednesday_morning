package m23_class_and_object;

public class DogClient {
    public static void main(String[] args) {
        Dog dog1 = new Dog();
        dog1.name= "Debbie";
        dog1.bread = "Husky";
        dog1.color = "Brown";
        dog1.age = 2;
        System.out.println("Name: " + dog1.name);
        System.out.println("Bread: " +dog1.bread);
        System.out.println("Age: " + dog1.age);
        System.out.println("Color: " + dog1.color);
        dog1.bark();
        dog1.eat();
        dog1.sleep();
        System.out.println(dog1);

        System.out.println("==============================================================");

        Dog dog2 = new Dog();
        dog2.name="Lessy";
        dog2.age = 1;
        dog2.bread = "Corgi";
        dog2.color = "Red";
        System.out.println(dog2);
        dog2.bark();
        dog2.eat();
        dog2.sleep();

        Dog dog3 = new Dog();
        dog3.name = "Miel";
        dog3.age = 4;
        dog3.bread = "Pitbull";
        dog3.color = "Brown";
        System.out.println(dog3);
        dog3.bark();
        dog3.eat();
        dog3.sleep();



    }
}
