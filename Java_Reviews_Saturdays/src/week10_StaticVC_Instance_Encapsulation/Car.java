package week10_StaticVC_Instance_Encapsulation;

public class Car {
    public String make,model,color;
    public int year;
    public double price;

    public class Tire{
        public String brand;
        public  String size;
        public double price;
        //public static int number = 4;

        public void m (){
            //System.out.println(make);
            //System.out.println(model);
        }
    }
}



class Q{
    public static void main(String[] args) {
       //System.out.println(Car.Tire.number);


    }
}
