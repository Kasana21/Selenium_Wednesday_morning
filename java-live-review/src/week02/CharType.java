package week02;

public class CharType {
    public static void main(String[] args) {
        //Java
        /*
        Two product ratings are same:
- declare and initialize double variable rating with 4.6;
- declare double variable anotherRating with same value of rating;
- print using variables and concatenation:
    "Product 1 rating is 4.6 and Product 2 rating is 4.6"
         */
        char first = 'J';
        char second = 'a';
        char third = 118;//'v'
        char forth = 97;//'a'
        System.out.println(first);
        System.out.println(second);
        System.out.println(third);
        System.out.println(forth);

        System.out.println("-------------------------------");
        /*

       You represent game levels using characters: E(Easy), M(Medium), H(Hard)
- declare char variable levelOne with value 'E'
- declare char variable levelTwo with value 'M'
- declare char variable levelThree with value 'H'
- print out each value:
    Level One: E
    Level Two: M
    Level Three: H
         */

        char levelOne = 'E';
        char levelTwo = 'M';
        char levelThree = 72;//'H'

        System.out.println("Level One: " + levelOne);
        System.out.println("Level Two: " + levelTwo);
        System.out.println("Level Three: " + levelThree);

        char someChar = '\u18D9';
        System.out.println(someChar);

        char dollar = '\u0024';
        char euro = '\u20AC';
        System.out.println("Dollar symbol : " + dollar);
        System.out.println("Euro symbol : " + euro);
    }
}
