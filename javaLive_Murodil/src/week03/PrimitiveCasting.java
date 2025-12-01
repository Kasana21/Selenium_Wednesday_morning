package week03;

public class PrimitiveCasting {
    public static void main(String[] args) {
        //Small datatype to larger datatype
        byte small = 100;
        int large = small;
        System.out.println("small = " + small);
        System.out.println("large = " + large);

        int itemPrice = 5;
        double finalPrice = itemPrice;
        System.out.println("itemPrice = " + itemPrice);
        System.out.println("finalPrice = " + finalPrice);

        //Large datatype to small datatype
        double balance = 1250.75;
        int roundedBalance = (int)balance;
        System.out.println("balance = " + balance);
        System.out.println("roundedBalance = " + roundedBalance);

        int itemCode = 100;
        byte storedCode = (byte) itemCode;
        System.out.println("itemCode = " + itemCode);
        System.out.println("storedCode = " + storedCode);
    }
}