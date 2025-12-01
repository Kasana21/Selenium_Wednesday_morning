package m10_variables_data_types;

public class WholeNumbers {
    public static void main(String[] args) {
        // DataType variableName = Data;
        
        byte maxByte = 127;
        System.out.println(maxByte);//reading variable
        System.out.println("maxByte");//reading as string

        short maxShort = 32767;
        //short maxShort = 32_767;// more readable way
        System.out.println(maxShort);

        int maxInt = 2147483647;
        //int maxInt = 2_147_483_647;
        System.out.println(maxInt);

        long maxLong = 9223372036654775807L;
        System.out.println(maxLong);



    }
}
