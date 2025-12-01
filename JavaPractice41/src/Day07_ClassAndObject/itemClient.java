package Day07_ClassAndObject;

public class itemClient {
    public static void main(String[] args) {
        Item shoes = new Item();

        shoes.itemName = "Shoes";
        shoes.unitPrice = 45.55;
        shoes.quantity = 23;
        System.out.println(shoes);

        System.out.println("===========================");
        Item notebook = new Item();

        notebook.itemName= "Notebook";
        notebook.unitPrice =2.55;
        notebook.quantity = 3;
        System.out.println(notebook);

    }
}
