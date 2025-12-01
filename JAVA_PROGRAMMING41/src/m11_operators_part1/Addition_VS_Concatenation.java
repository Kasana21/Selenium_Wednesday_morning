package m11_operators_part1;

public class Addition_VS_Concatenation {
    public static void main(String[] args) {
        System.out.println(3+5);//8
        System.out.println(3 + 5 + "Cydeo" + 3 +5 );//8Cydeo35
        //                8 + "Cydeo" + 3 +5
        //                "8Cydeo" +3 + 5
        //                "8Cydeo3"+5   //because execution from left to right and after "Cydeo" everything that done before will be considered as string so everything to the right will be concatenation
        //                 "8Cydeo35"
        System.out.println("============================");
        System.out.println(3 + 5 + "Cydeo" + (3 +5 ));// 8Cydeo8// because psrentices operations done befor everything else

    }
}
