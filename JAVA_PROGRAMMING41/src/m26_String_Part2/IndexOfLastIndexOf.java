package m26_String_Part2;

public class IndexOfLastIndexOf {
    public static void main(String[] args) {
        String str = "Java Programming Language";

        int indexOfFirstA = str.indexOf("a");
        System.out.println("indexOfFirstA = " + indexOfFirstA);//indexOfFirstA = 1

        int indexOfSecondA = str.indexOf("a P");
        System.out.println("indexOfSecondA = " + indexOfSecondA);//indexOfSecondA = 3
        
        int indexOfThirdA = str.indexOf("a", 5);
        System.out.println("indexOfThirdA = " + indexOfThirdA);//indexOfThirdA = 10
        
        int indexOfForthA = str.indexOf("a", indexOfThirdA + 1);
        System.out.println("indexOfForthA = " + indexOfForthA);//indexOfForthA = 18

        int indexOfLastA = str.lastIndexOf("a");
        System.out.println("indexOfLastA = " + indexOfLastA);//indexOfLastA = 22
    }
}
