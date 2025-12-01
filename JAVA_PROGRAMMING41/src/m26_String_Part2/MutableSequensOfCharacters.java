package m26_String_Part2;

public class MutableSequensOfCharacters {
    public static void main(String[] args) {
        //StringBuilder is mutable<- u dont need to reassign == .append() <- its just adding to what u building. which is case sensitive. so if there is space it will show u a space

        StringBuilder stringBuilder = new StringBuilder("Java");
        stringBuilder.append(17);//
        stringBuilder.append(" Programming");
        System.out.println(stringBuilder);//Java17 Programming

        System.out.println("=======================================");

        stringBuilder.reverse();
        System.out.println(stringBuilder);//gnimmargorP 71avaJ

        //stringBuilder.reverse();
       // System.out.println(stringBuilder);//Java17 Programming

        System.out.println("=======================================");

        String result = stringBuilder.toString();
        System.out.println(result);// so result is a String now and not stringBuilder

        System.out.println("=======================================");

        StringBuffer stringBuffer = new StringBuffer("Java");
        stringBuffer.append(" Programming");
        stringBuffer.reverse();
        String result2 = stringBuffer.toString();
        System.out.println(result2);



    }
}
