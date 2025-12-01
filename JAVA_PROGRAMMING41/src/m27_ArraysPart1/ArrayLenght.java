package m27_ArraysPart1;

public class ArrayLenght {
    public static void main(String[] args) {
        String[] names = {"James", "Aaron", "Yulia", "Hazel"};
       int lengthOfArray = names.length;
        System.out.println("lengthOfArray = " + lengthOfArray);//lengthOfArray = 4

        int lastIndex = lengthOfArray - 1;//<- finding last index of the array

        //calling the last array variable
        System.out.println(names[lastIndex]);//Hazel

        //to call a element of the array u need to call in [needed index og the element]
        System.out.println("=======================");
        int[] numbers = {10,20,30,40,50,60,70};
        //iterating array
       /* for (int i = 0; i < numbers.length; i++) {//i < numbers.length <- will be last index number,
            System.out.println(numbers[i]);
        }
        */

        //reversed order iterating the array
        for (int i = numbers.length-1; i>= 0; i--){
            System.out.println(numbers[i]);
        }
        

    }
}
