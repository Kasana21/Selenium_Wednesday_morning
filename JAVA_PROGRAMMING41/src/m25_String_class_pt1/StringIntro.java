package m25_String_class_pt1;

public class StringIntro {
    public static void main(String[] args) {
        String st1 = "Wooden Spoon";// String literal
        String st2 = "Wooden Spoon";// String literal
        // only one of them is located in the string pool in the heap because it doesnt allow duplicates. its referencing the both literal objects

        // to check if the objects are the same you can use == operator like below. if its same it will show true
        System.out.println(st1 == st2);

        String st3 = new String("Wooden Spoon");//new object,in the heap as a new object, outside of string pool
        String st4 = new String("Wooden Spoon"); //new object
        System.out.println(st3== st4); //false // because 

    }
}
