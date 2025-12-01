package week05_CustomMethods_ForLoop;

    public class MethodOverloading {

        public static void main(String[] args) {

            String result = contactStrings("Cydeo", "School");

            System.out.println(result);

            result = contactStrings("Java", "Programming", "Language");

            System.out.println(result);

            System.out.println("----------------------------");

            String str = "Wooden Spoon";

            //str.substr

        }

        public static String contactStrings(String str1, String str2) {
            return str1 + " " + str2;
        }

        public static String contactStrings(String str1, String str2, String str3) {
            return str1 + " " + str2 + " " + str3;
        }

        public static String contactStrings(String str1, String str2, String str3, String str4) {
            return str1 + " " + str2 + " " + str3 + " " + str4;
        }


    }

