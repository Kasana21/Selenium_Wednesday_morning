package m23_class_and_object;

import java.util.Scanner;

public class CarClient {
    public static void main(String[] args) {
        Car  car1 = new Car();
        car1.make = "Toyota";
        car1.model = "Corolla";
        car1.year = 2023;
        car1.color = "Black";
        car1.price = 30_000;


        car1.start();//Toyota Corolla is starting.
        car1.drive();//Toyota Corollais driving.
        car1.stop();//Toyota Corollais stopping.
        car1.showCurrentSpeed(85, 70);//Toyota is driving at 85, over the speed limit 70

        //in the class car toString was generated without it it will give us hashCode if we try to print car object
        System.out.println(car1);//Car{make='Toyota', model='Corolla', year=2023, color='Black', price=0.0}

        Car car2 = new Car();

        car2.make ="Hynday";
        car2.model = "Santa Fe";
        car2.price = 20_000;
        car2.color = "Blue";
        car2.year = 2018;

        car2.showCurrentSpeed(65,65);//Hynday is driving at 65, following the speed limit 65
        System.out.println(car2);//Car{make='Hynday', model='Santa Fe', year=2018, color='Blue', price=20000.0}



    }
}
