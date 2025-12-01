package m27_ArraysPart1;

public class ForEachLoop {
    public static void main(String[] args) {

        int []  numbers = {15, 30, 45, 60, 75, 90};
        //in this loop there is no index numbers it prints front to back.iteration order is fixed
        for (int each :numbers){//<- each represents each element of this array
            System.out.println(each);
        }

        System.out.println("=================");

        String[] names = {"Java", "Phyton", "C#", "Ruby"};
        for (String name : names) {
            System.out.println(name);
        }


    }
}
