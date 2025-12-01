package week04.evening;

public class T4_Ternary {
    public static void main(String[] args) {

        int a = 30;
        int b = 20;
       // int max = 0 ;
/*
        if(a>b){
            max=a;
        }else if (b>a){
            max=b;
        }else{
            System.out.println("numbers are equal");
        }
        System.out.println("max = "+max);

 */
       String max=
                       (a>b) ? a +" " :
                       (b>a)? b + " " :
                               "equal";
        System.out.println("max = " + max);


    }
}
