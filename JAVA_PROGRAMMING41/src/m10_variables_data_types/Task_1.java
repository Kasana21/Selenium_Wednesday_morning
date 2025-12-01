package m10_variables_data_types;

public class Task_1 {
    public static void main(String[] args) {
        int a,b,c;
        a=10;
        b=20;

        c=a;
        a=b;
        System.out.println(a);//20
        System.out.println(b);//20
        System.out.println(c);//10
    }

}
