package week8;
import java.util.Locale;
public class StringMethods {

    public static void main(String[] args) {
        //1) ----String comparison-----
        String correctPassword = "secret123";
        String inputPassword = "secret123";

        //== comparing if both pointing to same object in memory
        System.out.println(correctPassword == inputPassword);
        //equals() compares if both values match
        System.out.println(correctPassword.equals(inputPassword));

        if (correctPassword.equals(inputPassword)) {
            System.out.println("Access Granted.");
        } else {
            System.out.println("Access denied. Incorrect password.");
        }

        String correctUsername = "secret123";
        String inputUsername =   "SECRET123";
        if (inputUsername.equalsIgnoreCase(correctUsername)) {
            System.out.println("Username found.");
        } else {
            System.out.println("Username not found, try again");
        }

        System.out.println("----concat-----");
        String firstName = "John";
        String lastName = "Doe";
        String fullName = firstName.concat(" ").concat(lastName);
        System.out.println("fullName = " + fullName);

        System.out.println("3) ----String case conversion-----");
        String city = "LoNDoN";
        System.out.println(city.toLowerCase());
        System.out.println(city);
        String lowerCaseCity = city.toLowerCase();
        System.out.println("lowerCaseCity = " + lowerCaseCity);

        city = city.toLowerCase();
        System.out.println("city = " + city);

        String bookName = "java programming";
        System.out.println("bookName = " + bookName);
        bookName = bookName.toUpperCase();
        System.out.println("bookName = " + bookName);

        String command = "StArT";
        if (command.toLowerCase().equals("start")) {
            System.out.println("Game is starting...");
        } else {
            System.out.println("Unknown command.");
        }

        String userAnswer = "YES";
        userAnswer = userAnswer.toLowerCase();
        if (userAnswer.equals("yes")) {
            System.out.println("You agreed.");
        } else {
            System.out.println("You declined.");
        }

        System.out.println("3) ----length-----");

        System.out.println("intelliJ IDE".toUpperCase());
        System.out.println("Wooden spoon".length());

        String word = "Java";
        System.out.println("length of word = " + word.length());
        int wordLength = word.length();
        System.out.println("wordLength = " + wordLength);

        String empty = "";
        System.out.println("empty length = " + empty.length());

        var message = "  Java is fun  ";
        System.out.println("message.length() = " + message.length());

        System.out.println("--Check Password Length Rule--");
        String newPassword = "abc12";
        if (newPassword.length() >= 6) {
            System.out.println("Password accepted.");
        } else {
            System.out.println("Password too short. Must be at least 6 characters.");
        }

        System.out.println("4) ----charAt(int index)----");
        //              0123
        String city2 = "Rome";
        System.out.println(city2.charAt(0));
        System.out.println(city2.charAt(1));
        System.out.println(city2.charAt(2));
        System.out.println(city2.charAt(3));

        String code = "XY123Z";
        System.out.println(code.charAt(0) + "" + code.charAt(code.length()-1));
        for(int i = 0; i < code.length(); i++) {
            System.out.println(code.charAt(i));
        }

        System.out.println("abc".length());
        //      012
        System.out.println("abc".charAt(0));

        System.out.println("5) ----indexOf----");
        //-Find a Character:
        String animal = "elephant";
        System.out.println("index of p = " + animal.indexOf('p'));
        int eIndex = animal.indexOf("e");
        System.out.println("eIndex = " + eIndex);

        //-Find a Word in a Sentence:
        String sentence = "Learning Java is fun!";
        int index = sentence.indexOf("Java");
        System.out.println("'Java' starts at index: " + index);

        //-When Not Found:
        String studentName = "Daniel";
        System.out.println(studentName.indexOf('z'));

        //-Check with if found:
        String menu = "Coffee, Tea, Juice";
        if (menu.toLowerCase().indexOf("tea") >= 0) {
            System.out.println("tea is in the menu");
        } else {
            System.out.println("tea is not in the menu");
        }

        System.out.println("6) ----lastIndexOf----");
        //-Find Last ‘a’ in a Word:
        String fruit = "banana";
        System.out.println(fruit.lastIndexOf("a"));
        int lastA = fruit.lastIndexOf("a");
        System.out.println("lastA = " + lastA);

        //-Find Last Word Occurrence
        String log = "error: file not found. Error: retry";
        int lastError = log.toLowerCase().lastIndexOf("error");
        System.out.println("lastError = " + lastError);

        //-Check if ‘x’ Appears Only Once:
        String str = "example";
        if (str.indexOf('x') == str.lastIndexOf('x')) {
            System.out.println("x is unique");
        } else {
            System.out.println("x is not unique");
        }

        System.out.println("7) ----substring----");
        //Extract First Name:
        String fName = "John Doe";
        System.out.println(fName.substring(0, 4));
        System.out.println("smiles".substring(1, 5)); //mile

        fName = "Johnson Doe";
        System.out.println("First name = " + fName.substring(0, fName.indexOf(" ")));

        //Get File Extension:
        String fileName = "report.pdf";              //   7+1
        String extension = fileName.substring(fileName.lastIndexOf(".") + 1);

        System.out.println("extension = " + extension);

        //Extract company name from link
        String link = "www.google.com";
        String company = link.substring(link.indexOf(".")+1, link.lastIndexOf("."));
        System.out.println("company = " + company);

        System.out.println("8) ----replace----");
        //Replace Characters in a Word:
        String snack = "banana";
        System.out.println(snack.replace("a","*"));
        System.out.println(snack.replaceFirst("a","*"));
        System.out.println("coffee".replace("f", "g"));

        //Replace all words:
        String animals = "Cats are cute. CATS love naps.";
        String changed = animals.toLowerCase().replace("cats", "dogs");
        System.out.println("changed = " + changed);

        //Remove empty spaces:
        String discordMsg = "Hello Dear Future SDETs";
        discordMsg = discordMsg.replace(" ", "");
        System.out.println("discordMsg = " + discordMsg);

        System.out.println("9) ----replaceAll----");
        //Remove All Digits:
        String input = "Order8558Confirmed";
        String cleaned = input.replaceAll("\\d", "");
        System.out.println("cleaned = " + cleaned);
    }
}