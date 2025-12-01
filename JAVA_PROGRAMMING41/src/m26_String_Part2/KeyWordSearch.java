package m26_String_Part2;

public class KeyWordSearch {

    public static void main(String[] args) {
        String text = "Code without tests is broken by design.";
        String keyword = "DESIGN";

        boolean r = containsKeyWord(text, keyword);
        System.out.println(r);

        String result = "      ";
        System.out.println(result.isEmpty());//false <-- because there is white space == character  and its not empty
        System.out.println(result.isBlank());//true

    }
    public static Boolean containsKeyWord(String text, String keyword){
        //text = text.toLowerCase();
        //keyword = keyword.toLowerCase();

        // for contains() regardles of case sensetivity u should convert String all to Upper or Lower case
        return  text.toLowerCase(). contains(keyword.toLowerCase());
    }
}
