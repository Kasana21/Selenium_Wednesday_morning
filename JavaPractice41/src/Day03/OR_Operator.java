package Day03;

public class OR_Operator {
    public static void main(String[] args) {
        int b = 2;
        boolean result = (++b == 2 || b == 2) && -- b == 2;//false
        System.out.println(result);//false
        System.out.println(b);//3
    }
}
