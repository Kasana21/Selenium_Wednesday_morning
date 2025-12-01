package week06;

public class MethodsWithReturn {
    public static void main(String[] args) {
        System.out.println(getCurrentYear());
        // 2025
        System.out.println(getCurrentYear() + 1);
        //    2025          2025
        int thisYear = getCurrentYear();
        System.out.println("thisYear = " + thisYear);

        System.out.println("---------------");
        //35
        System.out.println(calculateAge(1990));
        int mikeBirthYear = 1961;
        int mikeAge = calculateAge(mikeBirthYear);
        System.out.println("Mike was born in " + mikeBirthYear + " and " + mikeAge + " years old");

        System.out.println("2000 => " + calculateAge(2000));

        int birthYear = 2007;
        if (calculateAge(birthYear) >= 18) {
            System.out.println("Eligible to vote");
        } else {
            System.out.println("Not eligible to vote");
        }

        System.out.println("------------------");
        System.out.println("Is it free shipping? - " + hasFreeShipping(125.50));
        System.out.println("Is it free shipping? - " + hasFreeShipping(22.0));
        if (hasFreeShipping(54.0)) {
            System.out.println("You qualified for Free shipping");
        } else {
            System.out.println("$4.99 shipping fee applied");
        }

        System.out.println("-------------------");

        double euros = convertDollars(100, "EUR");
        System.out.println("euros = " + euros);

        double japanese = convertDollars(100, "JPY");
        System.out.println("japanese = " + japanese);

        System.out.println(convertDollars(55.50, "TRY"));
        System.out.println("$20 in Korean = " +  convertDollars(20, "KRW"));

        System.out.println("--------------");

        System.out.println("Your total is $" + calculateTotal(33.50));
    }

    public static double calculateTax(double price) {
        return price * 0.10;
    }

    public static double calculateTotal(double price) {
        double totalPrice = price + calculateTax(price);
        return totalPrice;
    }

    public static double convertDollars(double USDAmount, String currency) {
        double result = 0;
        switch (currency) {
            case "EUR" -> result = USDAmount * 0.94;
            case "JPY" -> result = USDAmount * 149.51;
            case "TRY" -> result = USDAmount * 40.94;
            case "KRW" -> result = USDAmount * 1395.22;
            case "INR" -> result = USDAmount * 83.97;
            default -> System.out.println("Currency not supported");
        }
        return result;
    }

    public static boolean hasFreeShipping(double orderTotal) {
        if (orderTotal >= 50.0) {
            return true;
        } else {
            return false;
        }
    }

    public static int calculateAge(int birthYear) {
        int resultAge = getCurrentYear() - birthYear;
        //int resultAge = 2025 - birthYear;
        return resultAge;
    }

    public static int getCurrentYear() {
        //System.out.println("Returning current year:");
        return 2025;
    }
}