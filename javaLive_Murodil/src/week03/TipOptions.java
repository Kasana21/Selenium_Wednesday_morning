package week03;
/*
3) TipOptions [variables, operators, concatenation]

Declare and assign the following variables
   String food (list of any 3 food items),
   Assign price for each item - item1Price, item2Price, item3Price
   Calculate total (amount you owe) includes all 3 item prices plus 5% tax

show the receipt of all the items and total cost of the bill
then display 3 tip options and how much they would cost.
show the tip for 10%, 18% and 25%
 */
public class TipOptions {
    public static void main(String[] args) {
        String food = "Pizza, Drink, Salad";
        double item1Price = 11.0;
        double item2Price = 2.50;
        double item3Price = 7.50;
        double total = item1Price + item2Price + item3Price;
        double tax = total * 0.05; //5% tax
        total += tax; //total = totak + tax;

        System.out.println("\tThanks for dining with us!\n");
        System.out.println("You ordered : " + food);
        System.out.println("Total       : $" + total);

        System.out.println("\nSelect one of Tip options:");
        System.out.println("10% : $" + (total * 0.10));
        System.out.println("18% : $" + (total * 0.18));
        System.out.println("25% : $" + (total * 0.25));
    }
}