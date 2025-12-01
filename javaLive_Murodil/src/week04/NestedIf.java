package week04;

public class NestedIf {
    public static void main(String[] args) {
        boolean loggedIn = true, paymentInfoSaved = false;

        if (loggedIn) {
            if (paymentInfoSaved) {
                System.out.println("Proceed to payment");
            } else {
                System.out.println("Please enter your payment info");
            }
        } else {
            System.out.println("Login to continue");
        }

        System.out.println("---------------");

        boolean isPrimeMember = false;
        double orderAmount = 23.99;
        String shipping;
        if (isPrimeMember) {
            if (orderAmount >= 35.0) {
                shipping = "Free same day shipping";
            } else {
                shipping = "Free prime shipping";
            }
        } else {
            if (orderAmount >= 35.0) {
                shipping = "Free regular shipping";
            } else {
                shipping = "$5.99 shipping fee";
            }
        }

        System.out.println("orderAmount = $" + orderAmount + " | shipping = " + shipping);

    }
}