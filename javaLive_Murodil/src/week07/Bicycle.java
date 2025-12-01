
package week07;

public class Bicycle {
    public String brand;
    public int gear;

    public void ride() {
        System.out.println("Riding a Bicycle " + brand + " on Gear " + gear);
    }

    public void changeGear(int newGear) {
        if (newGear > gear) {
            System.out.println("Gearing up to " + newGear);
        } else {
            System.out.println("Gearing down to " + newGear);
        }
        gear = newGear;
    }

    public String toString() {
        return "Bicycle{" +
                "brand='" + brand + '\'' +
                ", gear=" + gear +
                '}';
    }
}
