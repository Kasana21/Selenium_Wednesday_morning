package m23_class_and_object;

public class Car {
    /*
Create a custom, class named Car,with the following fieldsand actions:
Fields: make, model, year, color, price
Actions :
start(): It will print : "$make model is starting."
drive(): It will print : "$make model is driving."
stop():  It will print : "$make model is stopping."
showCurrentSpeed(currentSpeed, speedLimit): compare the current speed with the speed limit. and print:
"Maker is driving at $currentSpeed, following the speed limit $speedLimit"

Bur is the currentSpeed is higher than speedLimit, it will print:
"Maker is driving at $currentSpeed, over the speed limit $speedLimit"
*/
 public String make, model;
 public int year;
 public String color;
 public double price;
 public void start(){
     System.out.println(make + " " + model + " is starting.");
 }
  public void drive(){
      System.out.println(make + " " + model + " is driving.");
  }
  public void stop(){
      System.out.println(make + " " + model + " is stopping. ");
  }

    public String toString() {
        return "Car{" +
                "make='" + make + '\'' +
                ", model='" + model + '\'' +
                ", year=" + year +
                ", color='" + color + '\'' +
                ", price=" + price +
                '}';
    }

    public void showCurrentSpeed(int currentSpeed, int speedLimit){
     if (currentSpeed<=speedLimit){
         System.out.println(make + " is driving at " + currentSpeed+ ", following the speed limit " + speedLimit);
     }else {
         System.out.println(make + " is driving at " + currentSpeed + ", over the speed limit " + speedLimit);
     }

  }



}

