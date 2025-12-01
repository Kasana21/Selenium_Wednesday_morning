package week02;

public class CharType {
    public static void main(String[] args) {
        //Java
        char first = 'J';
        char second = 'a';
        char third = 118;
        char fourth = 97;

        System.out.println(first);
        System.out.println(second);
        System.out.println(third);
        System.out.println(fourth);

        //You represent game levels using characters: E(Easy), M(Medium), H(Hard)
        char levelOne = 'E';
        char levelTwo = 'M';
        char levelThree = 72;//H
        System.out.println("Level One : " + levelOne);
        System.out.println("Level Two : " + levelTwo);
        System.out.println("Level Three : " + levelThree);

        char someChar = '\u18D9';
        System.out.println(someChar);

        char dollar = '\u0024';
        char euro = '\u20AC';
        System.out.println("Dollar symbol : " + dollar);
        System.out.println("Euro symbol : " + euro);
    }
}